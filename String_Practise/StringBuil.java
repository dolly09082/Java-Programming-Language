package String_Practise;
import java.util.*;
public class StringBuil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dolly"); 
        System.out.println(sb);

    //     //char at index 0
    //     System.out.println(sb.charAt(0));

    //     //set char at index
    //   sb.setCharAt(0,'P');
    //   System.out.println(sb);
    sb.insert(2,'l');
    System.out.println(sb);

    //delete the extra n
    sb.delete(4,6);
    System.out.println(sb);
        
    }
    
}
