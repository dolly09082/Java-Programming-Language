package Array_Practice;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter value :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value of x :");
        int x = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (x < a[i]) {
                x = a[i];
                c++;
            }
        }
        System.out.println("Output :" + c);

    }

}
