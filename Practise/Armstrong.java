import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0, c = 0, x;

        // use temp to count digits
        int copy = temp;
        while (copy > 0) {
            copy = copy / 10;
            c++;
        }

        // use temp again to calculate sum
        copy = temp;
        while (copy > 0) {
            x = copy % 10;
            rev += (int)Math.pow(x, c);
            copy = copy / 10;
        }

        if (n == rev) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
