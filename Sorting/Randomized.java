import java.util.*;

class RandomizedQuickSort {

    static Random rand = new Random();
    static int count = 0;

    static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = randomizedPartition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    static int randomizedPartition(int[] A, int p, int r) {
        int i = rand.nextInt(r - p + 1) + p;
        swap(A, i, r);
        return partition(A, p, r);
    }

    static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            count++;
            if (A[j] <= x) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        quickSort(A, 0, n - 1);

        System.out.println("\n\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nTotal comparisons/swaps: " + count);
    }
}
