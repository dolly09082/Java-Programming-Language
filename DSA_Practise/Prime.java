package DSA_Practise;
import java.util.Scanner;
public class Prime{
    public static boolean IsPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%2 == 0)
            return false;
        }
    return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
    
    if(IsPrime(n)){
        System.out.println("Number is prime");
    }
        else{
        System.out.println("Number is not prime");

    }
}

}