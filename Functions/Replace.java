import java.util.Scanner;

public class Replace {
    public static int[] replaceEvenWithZero(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                arr[i]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;

        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
         int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        replaceEvenWithZero(arr);
    }
    
}
