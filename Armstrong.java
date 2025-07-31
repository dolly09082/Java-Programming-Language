import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int result=0;
        int c=0;
        int temp=n;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        while(n>0){
            int y=n%10;
            result=result+(int)Math.pow(y,c);
             n=n/10;
        }
        if(x==result){
            System.out.println("IT is armstrong no ");

        }
        else{
            System.out.println("Not armstrong no");
        }
        
    }
    
}
