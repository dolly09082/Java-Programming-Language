import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            count++;
            int key = arr[i];
            int j = i - 1;
            count++;
            count++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                count++;
                j = j - 1;
                count++;
            }
            count++;
            count++;
            arr[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nCount : " + count);
        sc.close();
    }
}
