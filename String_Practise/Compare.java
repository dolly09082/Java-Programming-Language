package String_Practise;

public class Compare {
    public static void main(String[] args) {
        String name1 ="Radha";
        String name2 ="Dolly";

        //1 s1>s2 : +ve value
        //2 s1 == s2: 0
        //3 s1 < s2 : -ve value
        //hello wello

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
    
}
