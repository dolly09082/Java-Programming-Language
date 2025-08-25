package Search;
import java.util.Scanner;

public class Main {
    static int BinarySearch(int arr[], int n, int target) {
        int count = 0;
        int start = 0;
        count++;
        int end = n - 1;
        count++;
        count++;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            count++;
            count++;
            if (arr[mid] == target) {
                count++;
                System.out.println("count is " + count);
                return mid;
            } else if (arr[mid] < target) {
                count++;
                start = mid + 1;
                count++;
            } else if (arr[mid] > target) {
                count++;
                end = mid + 1;
                count++;
            }
            count++;
        }
        count++;
        count++;
        System.out.println("count is " + count);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, target;
        int[] arr = new int[100];
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target to be searched : ");
        target = sc.nextInt();
        int ans = BinarySearch(arr, n, target);
        if (ans != -1) {
            System.out.println("Target found in the array at index : " + ans);
        } else {
            System.out.println("Target not found");
        }
        sc.close();
    }
}
