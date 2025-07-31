import java.util.Scanner;

public class Person {
    
    public static void Eligible(int age){
        if(age>=18){
            System.out.println("Person is eligible to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age=sc.nextInt();
            Eligible(age);



         
    }
}
