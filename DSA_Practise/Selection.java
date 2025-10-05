package DSA_Practise;

public class Selection {
    public static void main(String[] args) {
        int a[] = {7, 8, 3, 2, 1};
        int temp;

        // Selection Sort
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;  // assume current index is min
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;  // update min index
                }
            }
            // swap a[i] with a[min]
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Print sorted array
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
