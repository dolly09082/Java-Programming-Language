import java.util.*;

public class ABC {

    // Function to find the length of the Longest Common Subsequence (LCS)
    static int LCS_len(String a, String b) {
        int n = a.length(), m = b.length();
        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    cur[j] = prev[j - 1] + 1;
                else
                    cur[j] = Math.max(prev[j], cur[j - 1]);
            }
            int[] temp = prev;
            prev = cur;
            cur = temp;
            Arrays.fill(cur, 0);
        }
        return prev[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items
        int N = sc.nextInt();
        sc.nextLine();

        // Input the string of items
        String[] parts = sc.nextLine().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) sb.append(p);
        String s = sb.toString();

        // Input fixed positions
        String line = "";
        if (sc.hasNextLine()) line = sc.nextLine().trim();
        List<Integer> fixedPos = new ArrayList<>();
        if (!line.isEmpty()) {
            for (String x : line.split("\\s+"))
                fixedPos.add(Integer.parseInt(x));
        }

        // Count of each character
        int cntA = 0, cntB = 0, cntC = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') cntA++;
            else if (ch == 'B') cntB++;
            else if (ch == 'C') cntC++;
        }

        String[] perms = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};
        int best = Integer.MAX_VALUE;

        for (String order : perms) {
            StringBuilder t = new StringBuilder();
            for (char ch : order.toCharArray()) {
                if (ch == 'A') t.append("A".repeat(cntA));
                else if (ch == 'B') t.append("B".repeat(cntB));
                else t.append("C".repeat(cntC));
            }

            boolean ok = true;
            for (int pos : fixedPos) {
                if (pos < 1 || pos > N || s.charAt(pos - 1) != t.charAt(pos - 1)) {
                    ok = false;
                    break;
                }
            }

            if (!ok) continue;

            int moves = N - LCS_len(s, t.toString());
            best = Math.min(best, moves);
        }

        if (best == Integer.MAX_VALUE)
            System.out.print("Impossible");
        else
            System.out.print(best);

        sc.close();
    }
}
