package Array_Practice;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int max=a[0];
        for(int i=0;i<n;i++){
            if(max < a[i]){
                max=a[i];
            }
            
        }
        System.out.println("Miximum value :"+max);
    }
    
}   

