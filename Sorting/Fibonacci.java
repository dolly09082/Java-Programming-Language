import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for series: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c, count = 0;

        System.out.print("\n" + a + " " + b + " ");

        count++;
        for (int i = 2; i < n; i++) {
            count++;
            count++;
            c = a + b;
            System.out.print(c + " ");

            a = b;
            count++;
            b = c;
        }
        count++;

        System.out.println("Count: " + count);
        sc.close();
    }
}

