import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next().charAt(0);
        sc.nextLine();
        String fixedLine = sc.nextLine().trim();
        List<Integer> fixed = new ArrayList<>();
        if (!fixedLine.isEmpty()) {
            for (String s : fixedLine.split(" ")) fixed.add(Integer.parseInt(s) - 1);
        }

        int minShifts = Integer.MAX_VALUE;
        char[] letters = {'A', 'B', 'C'};
        boolean possible = false;

        // Try all 6 possible orders of A, B, C
        for (char x : letters) {
            for (char y : letters) {
                for (char z : letters) {
                    if (x == y || y == z || x == z) continue;

                    int countX = 0, countY = 0;
                    for (char c : arr) {
                        if (c == x) countX++;
                        else if (c == y) countY++;
                    }
                    int total = arr.length;

                    // Check if fixed positions are valid for this arrangement
                    if (!checkFixed(arr, fixed, 0, countX, x) ||
                        !checkFixed(arr, fixed, countX, countX + countY, y) ||
                        !checkFixed(arr, fixed, countX + countY, total, z)) continue;

                    possible = true;
                    int shifts = countDiff(arr, 0, countX, x)
                               + countDiff(arr, countX, countX + countY, y)
                               + countDiff(arr, countX + countY, total, z);
                    minShifts = Math.min(minShifts, shifts);
                }
            }
        }

        if (!possible) System.out.print("Impossible");
        else System.out.print(minShifts);
    }

    static boolean checkFixed(char[] arr, List<Integer> fixed, int start, int end, char c) {
        for (int f : fixed) {
            if (f >= start && f < end && arr[f] != c) return false;
        }
        return true;
    }

    static int countDiff(char[] arr, int start, int end, char c) {
        int wrong = 0;
        for (int i = start; i < end; i++) {
            if (arr[i] != c) wrong++;
        }
        return wrong;
    }
}
