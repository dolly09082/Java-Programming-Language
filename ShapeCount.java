import java.util.*;
import java.io.*;

public class ShapeCount {

    static class Pair {
        long first, second;
        Pair(long f, long s) {
            this.first = f;
            this.second = s;
        }
    }

    static List<Pair> mergeIntervals(List<Pair> v) {
        v.sort(Comparator.comparingLong(a -> a.first));
        List<Pair> res = new ArrayList<>();
        for (Pair p : v) {
            if (res.isEmpty() || p.first > res.get(res.size() - 1).second) {
                res.add(new Pair(p.first, p.second));
            } else {
                if (p.second > res.get(res.size() - 1).second)
                    res.get(res.size() - 1).second = p.second;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        Map<Long, List<Pair>> hv = new HashMap<>();
        Map<Long, List<Pair>> vv = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long x1 = fs.nextLong(), y1 = fs.nextLong(), x2 = fs.nextLong(), y2 = fs.nextLong();

            if (y1 == y2) {
                if (x1 > x2) { long t = x1; x1 = x2; x2 = t; }
                hv.computeIfAbsent(y1, k -> new ArrayList<>()).add(new Pair(x1, x2));
            } else {
                if (y1 > y2) { long t = y1; y1 = y2; y2 = t; }
                vv.computeIfAbsent(x1, k -> new ArrayList<>()).add(new Pair(y1, y2));
            }
        }

        class H {
            long y, l, r;
            H(long y, long l, long r) { this.y = y; this.l = l; this.r = r; }
        }
        class V {
            long x, yb, yt;
            V(long x, long yb, long yt) { this.x = x; this.yb = yb; this.yt = yt; }
        }

        List<H> hs = new ArrayList<>();
        for (Map.Entry<Long, List<Pair>> e : hv.entrySet()) {
            long y = e.getKey();
            List<Pair> merged = mergeIntervals(e.getValue());
            for (Pair q : merged) hs.add(new H(y, q.first, q.second));
        }

        List<V> vs = new ArrayList<>();
        for (Map.Entry<Long, List<Pair>> e : vv.entrySet()) {
            long x = e.getKey();
            List<Pair> merged = mergeIntervals(e.getValue());
            for (Pair q : merged) vs.add(new V(x, q.first, q.second));
        }

        int h = hs.size();
        int v = vs.size();
        int w = (h + 63) >> 6; // divide by 64

        long[][] msk = new long[v][w];

        for (int i = 0; i < v; i++) {
            long x = vs.get(i).x, yb = vs.get(i).yb, yt = vs.get(i).yt;
            for (int j = 0; j < h; j++) {
                H hh = hs.get(j);
                if (yb <= hh.y && hh.y <= yt && hh.l <= x && x <= hh.r) {
                    int b = j >> 6, o = j & 63;
                    msk[i][b] |= (1L << o);
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < v; i++) {
            for (int j = i + 1; j < v; j++) {
                long k = 0;
                for (int b = 0; b < w; b++) {
                    long x = msk[i][b] & msk[j][b];
                    k += Long.bitCount(x);
                }
                if (k >= 2) ans += k * (k - 1) / 2;
            }
        }

        System.out.print(ans);
    }

    // Fast input for CodeVita-style
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
