import java.util.*;
public class Mul {
    public static int MulTwo(int a,int b){
        int c=a*b;
        return c;
    }
    


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int mul=MulTwo(a,b);
    System.out.println("Multiply of two number :"+mul);

}

}
