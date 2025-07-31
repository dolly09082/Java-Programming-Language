package Pattern;
public class Pattern_17 {
     public static void main(String[] args) {
        int n = 5; // size of square

        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < n; j++) { // columns
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line
        }
    }
}
