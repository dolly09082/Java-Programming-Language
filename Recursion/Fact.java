package Recursion;

public class Fact {
    public static void factorial(int n){
         int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }
    public static void main(String[] args) {
        int n=5;
    factorial(n);
       
    }
    
}
