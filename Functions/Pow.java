import java.util.Scanner;

public class Pow {
    public static int BaseExponent(int base,int exponent){
        int result=(int) Math.pow(base,exponent);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Base :");
        int base=sc.nextInt();
        System.out.println("Exponent :");
        int exponent=sc.nextInt();
       int Result=BaseExponent(base,exponent);
    
    System.out.println("Result :"+Result);
    }
    
}
