import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            int temp = 0;

            if (i < 2)
                continue; // skip 0 and 1 since they are not prime

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }

            if (temp == 0) { // prime number
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + sum);
    }
}
