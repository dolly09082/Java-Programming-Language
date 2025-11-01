import java.util.*;

public class CableWrap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        List<Integer> horizontal_rods = new ArrayList<>();
        List<Integer> vertical_rods = new ArrayList<>();

        // Find full horizontal rods (no '.')
        for (int i = 0; i < N; i++) {
            boolean full = true;
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '.') {
                    full = false;
                    break;
                }
            }
            if (full) horizontal_rods.add(i);
        }

        // Find full vertical rods (no '.')
        for (int j = 0; j < M; j++) {
            boolean full = true;
            for (int i = 0; i < N; i++) {
                if (grid[i][j] == '.') {
                    full = false;
                    break;
                }
            }
            if (full) vertical_rods.add(j);
        }

        boolean[][] is_cross = new boolean[N][M];

        // Mark vertical crosses
        for (int c : vertical_rods) {
            for (int i = 0; i < N; i++) {
                int left = c - 1, right = c + 1;
                if (left >= 0 && right < M && grid[i][left] == 'C' && grid[i][right] == 'C') {
                    is_cross[i][c] = true;
                }
            }
        }

        // Mark horizontal crosses
        for (int r : horizontal_rods) {
            for (int j = 0; j < M; j++) {
                int up = r - 1, down = r + 1;
                if (up >= 0 && down < N && grid[up][j] == 'C' && grid[down][j] == 'C') {
                    is_cross[r][j] = true;
                }
            }
        }

        boolean[][] cable = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'C' || is_cross[i][j]) {
                    cable[i][j] = true;
                }
            }
        }

        // Adjacency list for graph
        List<Integer>[] adj = new ArrayList[N * M];
        for (int i = 0; i < N * M; i++) adj[i] = new ArrayList<>();

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

        if (start == -1) { // Edge case: no start found
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[N * M];
        int[] sum_h = new int[N];
        int[] sum_v = new int[M];

        int curr = start, prev = -1;
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

            // Important fix: original C++ sign logic was redundant
            if (is_cross[cr][cc] && prev != -1) {
                int pr = prev / M, pc = prev % M;
                int sign = 1; // ‘C’ is constant, original check grid[cr][cc]=='C' is always true here

                if (pr == cr) // same row → vertical rod intersection
                    sum_v[cc] += ((pc < cc) ? 1 : -1) * sign;
                else           // same column → horizontal rod intersection
                    sum_h[cr] += ((pr < cr) ? 1 : -1) * sign;
            }

            if (next == -1) break;
            prev = curr;
            curr = next;
            visited[curr] = true;
        }

        long answer = 0;
        for (int r : horizontal_rods) answer += Math.abs(sum_h[r]) / 2;
        for (int c : vertical_rods) answer += Math.abs(sum_v[c]) / 2;

        System.out.print(answer);
    }
}

