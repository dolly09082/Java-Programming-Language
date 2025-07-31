package Pattern;
public class Pattern_15 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                if (k == 0 || k == (2 * (n - i) - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
