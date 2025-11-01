package OOPs.Constructors;

public class mine {
    int c ;
    static int s;
    public mine(){
       System.out.println("Hello");
    }

    public static void main(String[] args) {
        mine m1 = new mine();
        mine m2 = new mine();
        m1.c = 10;
        m2.c = 20;
        m1.s = 40;
        m2.s = 30;
        System.out.println(m1.c);
        System.out.println(m2.c);
        System.out.println(m1.s);
        System.out.println(m2.s);

    }
    
}
