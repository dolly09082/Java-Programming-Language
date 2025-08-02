import java.util.Scanner;

public class RemoveElement {
    public static int[] removeElement(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to remove: ");
        int target = sc.nextInt();

        int[] result = removeElement(arr, target);

        System.out.print("Resulting array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
