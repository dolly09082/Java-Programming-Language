import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("additon :"+ (a+b));
            break;
            case '-':
            System.out.println("Substraction :"+ (a-b));
            break;
            case '*':
            System.out.println("Multipilacation :" +(a*b));
            break;
            case '%':
            if(b!=0){
            System.out.println("Division :" +(a%b));
            }
            else{
                System.out.println("Error");
            }
            break;
            case '/':
            if(b!=0){
                System.out.println("Module :" +(a/b));
            }
            else{
                System.out.println("Error");
            }
           default:
           System.out.println("Invalid Operator");
        }
    }
}
