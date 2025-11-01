package DSA_Practise;

import java.util.Scanner;

public class Palin {

    static boolean Palindrom(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == temp) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int a[]={2,4,6,34,98,234};
        int c1=0;
        int c2=0;
        int sum=0;

        for (int i = 0; i < a.length; i++) {
            if (Palindrom(a[i])) {
                sum=sum + a[i];
            } else {
               // System.out.println("Its not a palindrome no");
               c2++;
            }

        }
        System.out.println(sum);
        System.out.println(c2);
    }

}
