package OOPs.Inheritance;

public class Hirarichal {
    void showA(){
        System.out.println("Hii" );
    }
   
}
 class Hirarichal1 extends Hirarichal{
    void showB(){
        System.out.println("Hello");
    }
}
class Hirarichal2 extends Hirarichal{
    void showC(){
        System.out.println("HiiHello");
    }
    public static void main(String[] args) {
        Hirarichal h = new Hirarichal();
         h.showA();
         Hirarichal1 h1 = new Hirarichal1();
         h1.showA();
         h1.showB();
         Hirarichal2 h2 = new Hirarichal2();
         h2.showA();
         h2.showC();
       
    }
}
