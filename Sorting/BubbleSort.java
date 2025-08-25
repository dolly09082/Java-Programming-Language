import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of Array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            count++;
            count++;
            for (int j = 0; j < (a.length - 1 - i); j++) {
                count++;
                count++;
                if (a[j] > a[j + 1]) {
                    count++;
                    temp = a[j];
                    count++;
                    a[j] = a[j + 1];
                    count++;
                    a[j + 1] = temp;
                    count++;
                    count++;
                }

            }
            count++;
        }
        count++;
        System.out.println("Sorted Array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i] + " ");
        }
        System.out.println("Count is :" + count);
    }
}
