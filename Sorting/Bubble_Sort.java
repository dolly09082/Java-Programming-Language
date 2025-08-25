import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of Array :");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter values :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int temp = 0;
    
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) { 
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
