import java.util.Scanner;

class QuickSort {

    static int count = 0;

    static void quickSort(int[] A, int p, int r) {
        count++;
        if (p < r) {
            int q = partition(A, p, r);
            count++;
            quickSort(A, p, q - 1);
            count++;
            quickSort(A, q + 1, r);
            count++;
        }
    }

    static int partition(int[] A, int p, int r) {
        int x = A[r];
        count++;
        int i = p - 1;
        count++;

        for (int j = p; j < r; j++) {
            count++;
            if (A[j] <= x) {
                count++;
                i = i + 1;
                count++;
                int temp = A[i];
                count++;
                A[i] = A[j];
                count++;
                A[j] = temp;
                count++;
            }
        }

        int temp = A[i + 1];
        count++;
        A[i + 1] = A[r];
        count++;
        A[r] = temp;
        count++;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        count++;

        int[] A = new int[n];
        count++;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            count++;
            A[i] = sc.nextInt();
            count++;
        }

        System.out.println("\nBefore Sorting:");
        for (int i = 0; i < n; i++) {
            count++;
            System.out.print(A[i] + " ");
        }

        quickSort(A, 0, n - 1);
        count++;

        System.out.println("\n\nAfter Sorting:");
        for (int i = 0; i < n; i++) {
            count++;
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nTotal statements executed: " + count);
    }
}
Both Merge Sort and Quick Sort are efficient divide-and-conquer algorithms, but their performance depends on the situation.

Merge Sort is stable, guarantees O(n log n) time in all cases, and works well with linked lists and external sorting (like files). However, it requires extra space (O(n)).

Quick Sort is faster in practice for arrays, uses less memory, and has good cache performance. But in the worst case, it can degrade to O(n²) unless optimized with techniques like random pivoting.

🔑 Final Point: If memory is not a concern and stability is required → use Merge Sort.
If speed and in-place sorting are important → use Quick Sort.

Do you want me to make a tabular summary (side-by-side differences)