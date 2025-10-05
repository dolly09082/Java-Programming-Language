package OOPs.Polymorphism.Metohd_Overriding;

public class Case4 {
    void show() throws RuntimeException {
        System.out.println("1");
    }  
}
class Case5 extends Case4{
    void show() throws RuntimeException{
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case4 c4 = new Case4();
        c4.show();
        Case5 c5 = new Case5();
        c5.show();
    }
}
