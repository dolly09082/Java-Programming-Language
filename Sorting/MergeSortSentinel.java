import java.util.Scanner;

public class MergeSortSentinel {

    static int count = 0;  

    public static void merge(int[] arr, int left, int mid, int right) {
        count++; 

        int n1 = mid - left + 1;
         count++;
        int n2 = right - mid;  
          count++;

        int[] L = new int[n1 + 1]; 
        count++;
        int[] R = new int[n2 + 1]; 
        count++;

        for (int i = 0; i < n1; i++) { 
            count++;
            L[i] = arr[left + i]; 
            count++;
        }
        for (int j = 0; j < n2; j++) {
             count++;
            R[j] = arr[mid + 1 + j]; 
            count++;
        }

        L[n1] = Integer.MAX_VALUE;
         count++;
        R[n2] = Integer.MAX_VALUE; 
        count++;

        int i = 0, j = 0; count += 2;

        for (int k = left; k <= right; k++) { 
            count++;
            if (L[i] <= R[j]) { 
                count++;
                arr[k] = L[i]; 
                count++;
                i++; 
                count++;
            } else {
                arr[k] = R[j]; 
                count++;
                j++; 
                count++;
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        count++; 
        if (left < right) { 
            count++;
            int mid = (left + right) / 2; 
            count++;
            mergeSort(arr, left, mid);
             count++;
            mergeSort(arr, mid + 1, right); 
            count++;
            merge(arr, left, mid, right); 
            count++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);

        System.out.println("Total statements executed: " + count);
    }
}
