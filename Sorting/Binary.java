public class Binary {
    public static void main(String[] args) {
        // ----------- SIZE = 4 -----------
        // int arr[] = { 1, 2, 3, 4 };
        // int n = 4;

        // // // Best Case → middle element (found in 1 step)
        // int search = 2;

        // // Average Case → present but not middle
      // int search = 4;

        // // Worst Case → not presentj       
         //int search = 100;

        // // // ----------- SIZE = 8 -----------
        //  int arr[] = {1,2,3,4,5,6,7,8};
        //  int n = 8;

        // // // Best Case → middle element
        //  int search = 5;

        // // Average Case → present, but not middle
        // int search = 2;

        // // Worst Case → not present
        //int search = 100;

        // ----------- SIZE = 16 -----------
        // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        // int n = 16;

        // // Best Case
         //int search = 9;

        // // Average Case
        //  int search = 14;

        // //Worst Case
        //  int search = 100;

        // // ----------- SIZE = 32 -----------
        // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,
        // 17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        // int n = 32;

        // // Best Case
        // int search = 16;

        // // Average Case
        // int search = 2;

        // // Worst Case
        // int search = 100;

        // // ----------- SIZE = 64 -----------
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,
        17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,
        33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,
        49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64};
        int n = 64;

        // // Best Case
       // int search = 32;

        // // Average Case
         //int search = 50;

        // // Worst Case
         int search = 100;

        //int search = 12;
        int st = 0;
        int end = arr.length - 1;
        int mid = (st + end) / 2;
        int c = 0;
        
        while (st <= end) {
            c++;
            mid=(st+end)/2;
            c++;

        

            if (arr[mid] == search) {
                c++;
                System.out.println("Find the element"+mid);
                break;
            } else if (arr[mid] < search) {
                c++;
                st = mid + 1;
            } else {
                c++;
                end = mid - 1;
            }
        }
       
        System.out.println("count is" + c);

    }
}
