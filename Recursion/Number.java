
import java.util.*;
public class Number {


public static void Number(int n){
    if(n>5){
        return;
    }
  System.out.println(n);
    Number(n-1);
}
    public static void main(String[] args) {
        int n=5;
        Number(n);
        
    }
    
}
