package DSA_Practise;

import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;

        while( n > 0){
            int num = n % 10;
            rev = rev*10+num;
            n=n/10; 
        }
        if(rev==temp){
            System.out.println("It is Palindrom");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
    
}
