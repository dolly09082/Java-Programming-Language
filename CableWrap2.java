import java.util.*;
import java.io.*;

public class CableWrap2 {
    public static void main(String[] args) {
        FastIO io = new FastIO();
        
        int N = io.nextInt();
        int M = io.nextInt();
        
        char[][] grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = io.next();
            for (int j = 0; j < M; j++) {
                grid[i][j] = row.charAt(j);
            }
        }
        
        List<Integer> horizontalRods = new ArrayList<>();
        List<Integer> verticalRods = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            boolean full = true;
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '.') {
                    full = false;
                    break;
                }
            }
            if (full) horizontalRods.add(i);
        }
        
        for (int j = 0; j < M; j++) {
            boolean full = true;
            for (int i = 0; i < N; i++) {
                if (grid[i][j] == '.') {
                    full = false;
                    break;
                }
            }
            if (full) verticalRods.add(j);
        }
        
        boolean[][] isCross = new boolean[N][M];
        for (int c : verticalRods) {
            for (int i = 0; i < N; i++) {
                int left = c - 1, right = c + 1;
                if (left >= 0 && right < M && grid[i][left] == 'C' && grid[i][right] == 'C') {
                    isCross[i][c] = true;
                }
            }
        }
        
        for (int r : horizontalRods) {
            for (int j = 0; j < M; j++) {
                int up = r - 1, down = r + 1;
                if (up >= 0 && down < N && grid[up][j] == 'C' && grid[down][j] == 'C') {
                    isCross[r][j] = true;
                }
            }
        }
        
        boolean[][] cable = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'C' || isCross[i][j]) {
                    cable[i][j] = true;
                }
            }
        }
        
        List<Integer>[] adj = new ArrayList[N * M];
        for (int i = 0; i < N * M; i++) {
            adj[i] = new ArrayList<>();
        }
        
        int[] di = {-1, 0, 1, 0};
        int[] dj = {0, 1, 0, -1};
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!cable[i][j]) continue;
                int id = i * M + j;
                for (int d = 0; d < 4; d++) {
                    int ni = i + di[d], nj = j + dj[d];
                    if (ni >= 0 && ni < N && nj >= 0 && nj < M && cable[ni][nj]) {
                        adj[id].add(ni * M + nj);
                    }
                }
            }
        }
        
        int start = -1;
        for (int i = 0; i < N && start == -1; i++) {
            for (int j = 0; j < M; j++) {
                if (cable[i][j] && adj[i * M + j].size() == 1) {
                    start = i * M + j;
                    break;
                }
            }
        }
        
        boolean[] visited = new boolean[N * M];
        int[] sumH = new int[N];
        int[] sumV = new int[M];
        
        int curr = start;
        int prev = -1;
        visited[curr] = true;
        
        while (true) {
            int cr = curr / M, cc = curr % M;
            int next = -1;
            
            for (int nb : adj[curr]) {
                if (nb != prev && !visited[nb]) {
                    next = nb;
                    break;
                }
            }
            
            if (isCross[cr][cc] && prev != -1) {
                int pr = prev / M, pc = prev % M;
                int sign = (grid[cr][cc] == 'C') ? 1 : -1;
                
                if (pr == cr) {
                    sumV[cc] += ((pc < cc) ? 1 : -1) * sign;
                } else {
                    sumH[cr] += ((pr < cr) ? 1 : -1) * sign;
                }
            }
            
            if (next == -1) break;
            
            prev = curr;
            curr = next;
            visited[curr] = true;
        }
        
        long answer = 0;
        for (int r : horizontalRods) {
            answer += Math.abs(sumH[r]) / 2;
        }
        for (int c : verticalRods) {
            answer += Math.abs(sumV[c]) / 2;
        }
        
        System.out.print(answer);
    }
    
    static class FastIO {
        BufferedReader br;
        StringTokenizer st;
        
        public FastIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}