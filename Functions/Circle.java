import java.util.Scanner;

public class Circle {
    public static double Circumference(int r){
        double result =  (2*3.14*r);

        return result;
    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    System.out.println("Result : "+Circumference(r));
    
}


}
