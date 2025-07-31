import java.util.*;
public class OddNum {
    public static int OddNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2 !=0){
                sum=sum+i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int result= OddNumber(n);
       System.out.println("Sum of odd no :"+result);

        
        
    }
    
}
