import java.io.*;
import java.util.*;

public class GravityGlide {
    static long k(int x, int y) { return ((long)x << 32) | (y & 0xffffffffL); }
    static long k3(int x, int y, int s) { return ((long)x << 32) | ((long)y << 8) | (s & 0xff); }
    static int pck(int x, int y) { return (x << 16) | (y & 0xffff); }
    static int ux(int v) { return v >>> 16; }
    static int uy(int v) { return v & 0xffff; }

    static final class In {
        private final InputStream in;
        private final byte[] buf = new byte[1 << 16];
        private int p = 0, l = 0;
        In(InputStream is) { in = is; }
        private int r() throws IOException {
            if (p >= l) { l = in.read(buf); p = 0; if (l <= 0) return -1; }
            return buf[p++];
        }
        int ni() throws IOException {
            int c;
            while ((c = r()) <= 32) if (c == -1) return Integer.MIN_VALUE;
            int s = 1;
            if (c == '-') { s = -1; c = r(); }
            int v = 0;
            while (c > 32) { v = v * 10 + (c - '0'); c = r(); }
            return v * s;
        }
    }

    static long fallKey(int x, int y, Map<Long, List<Integer>> mp) {
        for (int yy = y - 1; yy >= 0; yy--) {
            long kk = k(x, yy);
            if (mp.containsKey(kk)) return kk;
        }
        return k(x, 0);
    }

    public static void main(String[] args) throws Exception {
        In in = new In(System.in);
        int n = in.ni();
        if (n == Integer.MIN_VALUE) return;
        int[][] sld = new int[n][4];
        for (int i = 0; i < n; i++) {
            sld[i][0] = in.ni();
            sld[i][1] = in.ni();
            sld[i][2] = in.ni();
            sld[i][3] = in.ni();
        }
        int sx = in.ni();
        int sy = in.ni();
        int ene = in.ni();

        Map<Long, List<Integer>> mp = new HashMap<>(1024);
        Map<Long, Integer> nxt = new HashMap<>(1024);

        for (int s = 0; s < n; s++) {
            int x1 = sld[s][0], y1 = sld[s][1], x2 = sld[s][2], y2 = sld[s][3];
            int dx = (x2 > x1) ? 1 : -1;
            int dy = (y2 > y1) ? 1 : -1;
            int L = Math.abs(x2 - x1);
            if (dy == -1) {
                for (int k = 0; k < L; k++) {
                    int x = x1 + dx * k;
                    int y = y1 - k;
                    long key = k(x, y);
                    mp.computeIfAbsent(key, z -> new ArrayList<>()).add(s);
                    nxt.put(k3(x, y, s), pck(x + dx, y - 1));
                }
                long ke = k(x2, y2);
                mp.computeIfAbsent(ke, z -> new ArrayList<>()).add(s);
            } else {
                for (int k = 0; k < L; k++) {
                    int x = x2 - dx * k;
                    int y = y2 - k;
                    long key = k(x, y);
                    mp.computeIfAbsent(key, z -> new ArrayList<>()).add(s);
                    nxt.put(k3(x, y, s), pck(x - dx, y - 1));
                }
                long ke = k(x1, y1);
                mp.computeIfAbsent(ke, z -> new ArrayList<>()).add(s);
            }
        }

        int x = sx, y = sy;
        long cur = k(x, y);
        if (!mp.containsKey(cur)) {
            long p = fallKey(x, y, mp);
            x = (int)(p >>> 32);
            y = (int)(p & 0xffffffffL);
        }

        while (true) {
            if (y == 0) break;
            long key = k(x, y);
            List<Integer> ids = mp.get(key);
            if (ids == null) {
                long p = fallKey(x, y, mp);
                x = (int)(p >>> 32);
                y = (int)(p & 0xffffffffL);
                continue;
            }
            if (ids.size() == 1) {
                int si = ids.get(0);
                long tk = k3(x, y, si);
                Integer pn = nxt.get(tk);
                if (pn == null) {
                    long p = fallKey(x, y, mp);
                    x = (int)(p >>> 32);
                    y = (int)(p & 0xffffffffL);
                    continue;
                }
                if (ene == 0) break;
                ene--;
                x = ux(pn);
                y = uy(pn);
            } else {
                long cost = 1L * x * y;
                List<int[]> nexts = new ArrayList<>();
                for (int si : ids) {
                    long tk = k3(x, y, si);
                    Integer pn = nxt.get(tk);
                    if (pn != null) nexts.add(new int[]{ux(pn), uy(pn)});
                }
                if ((long)ene <= cost) {
                    if (nexts.isEmpty()) {
                        long p = fallKey(x, y, mp);
                        x = (int)(p >>> 32);
                        y = (int)(p & 0xffffffffL);
                        continue;
                    }
                    break;
                }
                ene -= (int)cost;
                if (nexts.isEmpty()) {
                    long p = fallKey(x, y, mp);
                    x = (int)(p >>> 32);
                    y = (int)(p & 0xffffffffL);
                    continue;
                }
                int bx = 0, by = -1;
                for (int[] np : nexts) {
                    if (np[1] > by) { by = np[1]; bx = np[0]; }
                }
                if (ene == 0) break;
                ene--;
                x = bx; y = by;
            }
        }

        System.out.print(x + " " + y);
    }
}