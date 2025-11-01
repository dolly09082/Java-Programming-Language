package DSA_Practise;

import java.util.Scanner;

public class Pal {
    public static Boolean Pals(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int num = n % 10;
            rev = rev * 10 + num;
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
        //int n = sc.nextInt();
        int a[]={121,232,1221,2332,7678,9870};
        /// int rev=0;
        //int temp = n;
        int c1=0;
        int c2=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
        if (Pals(a[i])) {
            //System.out.println("No is Palindrom");
            sum1=sum1+a[i];
            c1++;
        } else {
            //System.out.println("No is not Palindrom");
            sum2=sum2+a[i];
            c2++;

        }
    }
    System.out.println("total sum of palindrom: " +sum1+" "+"Total count of palindrom: "+c1);
    System.out.println("total sum of nonpalindrom: " +sum2+" "+"Total count of nonpalindrom: "+c2);

    }

}
