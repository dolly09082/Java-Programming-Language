package Array_Practice;

import java.util.Scanner;

public class Min {
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
        int min=a[0];
        for(int i=0;i<n;i++){
            if(min > a[i]){
                min=a[i];
            }
            
        }
        System.out.println("Minimum value :"+min);
    }
    
}   

