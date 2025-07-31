package Pattern;
import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int r=sc.nextInt();
        int i,j,k,l;
        for(i=1;i<=4;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
           // System.out.println("");
        
            for(l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    }
        
    


    

