package String_Practise;
   import java.util.*;
   public class StringIndex {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String first_name =sc.next();
        String Second_name=sc.next();
        String full_name =first_name + " " + Second_name;
        System.out.println(full_name.length());
        for(int i=0;i<full_name.length();i++){
            System.out.println(full_name.charAt(i));
        }

        
        }
    }