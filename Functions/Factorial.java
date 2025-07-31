import java.util.*;

public class Factorial {

    public static int Fact(int n) {
        int fact = 1;  // Declare outside the loop
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = Fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
