package Pattern;
import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // number of rows

        for (int i = 1; i <= r; i++) {

            // Spaces
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
