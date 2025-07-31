import java.util.Scanner;

public class Prime_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for( i=1;i<=100;i++){
            for( j=2;j<n;j++){
                if(i%j == 0){
                    System.out.println("No is not Prime");
                }
                break;
            }
        }
        if(i == n){
        System.out.println("No is prime");
    }
    
   }
}
