package OOPs.Polymorphism.Metohd_Overriding;

public class Overriding1 {
    void show(int a,int b){
        System.out.println("Hello Dolly");
    }
    
}
 class Overridding2 extends Overriding1{
    void show(int a,int b){
        System.out.println("Hii Doll");
    }
    public static void main(String[] args) {
        Overridding2 O2 = new Overridding2();
        O2.show(5,6);
    }
 }
