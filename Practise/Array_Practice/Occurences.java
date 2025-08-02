package Array_Practice;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter number to remove:");
        int target = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != target) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != target) {
                result[j] = a[i];
                j++;
            }
        }

        System.out.print("Resulting array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
