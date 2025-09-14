package OOPs.Polymorphism;

public class Case2 {
    void Show(Object a){
        System.out.println("Object Method");
    }
    
    void Show(String a){
        System.out.println("String Method");
    }
    public static void main(String[] args) {

        Case2 c1=new Case2();
        c1.Show("abcd");
        c1.Show(5);
        
    }
    
}
