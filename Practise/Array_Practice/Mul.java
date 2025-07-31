package Array_Practice;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int mul=1;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        
        }
        for(int i=0;i<n;i++){
            mul= mul*a[i];
        }
        System.out.println(mul);
    }

    
}
