package DSA_Practise;

import java.util.Scanner;

public class Search_Insert {
    public static void Search(int a[],int target){
         //target = sc.nextInt();
         for(int i=0;i<a.length;i++){
            if(a[i] == target){
                System.out.println("Output is :"+i);
            }
         }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements:");
        int n=sc.nextInt();
        System.out.println("Target is:");
        int target = sc.nextInt();
        System.out.println("array is:");
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Search(a,target);
    }

    
}
