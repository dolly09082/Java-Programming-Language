import java.util.Scanner;

public class RecursiveFibonacciCount {
    static int count = 0;

    static int fibonacci(int n) {
        if (n == 0) {
            count++;
            return 0;
        } else if (n == 1) {
            count++;
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int f = fibonacci(n);

        System.out.println("Count: " + count);
        sc.close();
    }
}
