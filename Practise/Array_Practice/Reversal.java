package Array_Practice;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int n=sc.nextInt();
        int a[ ]=new int[n];
        int temp=0;
        int i;
        System.out.println("give value ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //System.out.println("Swapping the value");
        for(i=0;i<n/2;i=i+2){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.println("After reversal");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
