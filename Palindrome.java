import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n=sc.nextInt();
        int y=n;
        while(n>0){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        System.out.println("no == "+rev);
        if(y==rev){
            System.out.println("no is paindrom");
        }
        else{
            System.out.println("no is not palindrom");
        }
    }
    
}
