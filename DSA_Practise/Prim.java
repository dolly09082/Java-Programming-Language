package DSA_Practise;
import java.util.*;

public class Prim{
    public static void main(String[] args) {
//         int n=7;
//         int i;
//         for(i=2;i<n;i++){
//          if(n%i == 0){
//             System.out.println("Num is not prime");
//             break;
//          }
//         }
//          if(i==n){
//             System.out.println("No is prime");
//          }
//     }  
// }
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
         
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(j/i==0){
                    System.out.println("no is not prime");
   
                }
            }
        }
        if()
    }
}
