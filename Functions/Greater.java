import java.util.Scanner;

public class Greater {
    public static int GreaterSum(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       // GreaterSum(a,b);
        System.out.println(" Result :" + GreaterSum(a,b));
    }

}
