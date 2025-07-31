package Array_Practice;

import java.util.Scanner;

public class Inplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter array size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int temp = 0;
        System.out.println("Enter array values : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before reversal : ");
        for (i = 0; i < n; i++) {
            System.out.print(+a[i] + " ");
            
        }
        
        for (i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - (i + 1)];
            a[n - (i + 1)] = temp;
        }
        System.out.println();

        System.out.println("Array after reversal : ");
        // System.out.println("");
        for (i = 0; i < n; i++) {
            System.out.print(+a[i] + " ");

        }

    }
}
