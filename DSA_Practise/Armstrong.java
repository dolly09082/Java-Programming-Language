package DSA_Practise;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int c = 0;

        int nCopy = n;
        while(nCopy > 0){
            int arm = nCopy % 10;
            c++;
            nCopy = nCopy / 10;
        }
        System.out.println(c);

        n = temp;
        while(n > 0){
            int arm = n % 10;
            sum = sum + (int)Math.pow(arm, c);
            n = n / 10;
        }

        if(sum == temp){
            System.out.println("No is Armstrong");
        } else {
            System.out.println("No is not Armstrong");
        }
    }
}
