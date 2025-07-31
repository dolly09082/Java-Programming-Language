package Pattern;
import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i,j,k;
        for(i=1;i<=r;i++){
            for(j=3;j>=i;j--){
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");  
        }
            for(i=2;i<=r;i++){

            for( j=2;j<=i;j++){
                System.out.print("  ");
            }
            for( k=r;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
            for(i=1;i<=r;i++){
                for(j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            for(i=1;i<=r;i++){
                for(j=1;j<=r-i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
    
    

