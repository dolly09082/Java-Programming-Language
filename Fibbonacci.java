import java.util.*;

public class Fibbonacci {
    public static void main(String args[]){
        int c=10;
        int n1=0;
        int n2=1;
        System.out.println(""+n1+" "+n2);
        for(int i=2;i<c;i++){
        int x=n1+n2;
         n1=n2;
         n2=x;
         System.out.println(x);
        }
}
    
}
