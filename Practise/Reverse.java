import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Reverse of the "+n+" is equal to");
        int x ;
        int rev=0;
        while(n>0){
            x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        System.out.println(+rev);
    }

    
}
