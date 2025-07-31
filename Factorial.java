import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of number = "+fact);
    }
    
}
