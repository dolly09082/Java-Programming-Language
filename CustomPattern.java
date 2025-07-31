import java.util.*;

public class CustomPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // number of top rows

        // Top Half
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  "); // 2 spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom Half
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  "); // 2 spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
