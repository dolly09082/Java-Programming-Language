package DSA_Practise;

import java.util.Scanner;

public class Armst {
    public static boolean Arms(int n) {
        int c = 0;
        int temp = n;
        int m = temp;
        while (n > 0) {
            n = n / 10;
            c++;
        }
       // System.out.println(c);
        // int m=temp;
        int sum = 0;
        while (temp > 0) {
            int num = temp % 10;
            sum = sum + (int) Math.pow(num,c);
            temp = temp / 10;
        }
        if (m == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int c1=0;
        int c2=0;
        int sum1=0;
        int sum2=0;

        int a[]={153,370,674,87,1634,8208};
        for(int i=0;i<a.length;i++){
        if (Arms(a[i])) {
            c1++;
            sum1=sum1+a[i];
        } else {
            c2++;
            sum2=sum2+a[i];
        }
    }
        System.out.println("Sum of No is Armstrong: "+sum1+" Count is : "+c1);

        System.out.println("Sum of No is not Armstrong: "+sum2+" Count is :"+c2);

    
}
}
