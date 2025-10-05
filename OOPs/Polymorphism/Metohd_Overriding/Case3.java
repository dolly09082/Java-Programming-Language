package OOPs.Polymorphism.Metohd_Overriding;

public class Case3 {
    void show() {
        System.out.println("1");
    }  
}
class Case4 extends Case3{
    void show() throws ArithmeticException{
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case4 c4 = new Case4();
        c4.show();
        Case3 c3 = new Case3();
        c3.show();
    }
}
