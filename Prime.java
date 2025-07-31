import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(int j=2;j<100;j++){
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("No is not prime no");
                break;
            }
        }
        if (i == n) {
            System.out.println("No is prime no");
        }
    }
    }
}
