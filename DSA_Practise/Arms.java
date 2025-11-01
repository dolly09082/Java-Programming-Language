package DSA_Practise;

import java.util.Scanner;

public class Arms {
    static int power(int rem, int c) {
        int mul = 1;
        for (int i = 0; i < c; i++) {
            mul = mul * rem;
        }
        return mul;
    }

    static boolean Armstrong(int n) {
        int temp = n;
        int c = 0;
        int sum = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        n = temp;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + power(rem, c);
            n = n / 10;

        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int a[] = { 12, 153, 567, 876, 345, 1634, 8208 };
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (Armstrong(a[i])) {
                // System.out.println(c1++);
                c1++;

            } else {
                // System.out.println(c2++);
                c2++;
            }
        }
        System.out.println("Armstrong no are :"+c1);
        System.out.println("Not Armstrong no are:"+c2);

        // System.out.println(power(24,5));

    }

}
