import java.net.Socket;
import java.util.Scanner;

public class CountEven {
   public static void countEvenOdd(int[] arr){
    int c=0;
    int m=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            c++;
        }
        else{
            m++;
        }
    }
        System.out.println("Even :"+c);
        System.out.println("ODD :"+m);
    
   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        countEvenOdd(arr);
        
    }
    
}
