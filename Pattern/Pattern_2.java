package Pattern;
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  // Input number of rows

        for (int i = 1; i <= r; i++) {
            // Print spaces (2 spaces per position for alignment)
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }

            // Print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
