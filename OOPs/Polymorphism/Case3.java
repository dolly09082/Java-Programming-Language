package OOPs.Polymorphism;

public class Case3 {
    
    void Show(StringBuffer a){
        System.out.println("StringBuffer Method");
    }
    void Show(String a){
        System.out.println("String Method");
    }
    public static void main(String[] args) {
        Case3 c1 = new Case3();
        c1.Show("absh");
        c1.Show(new StringBuffer("xyz"));
        //c1.Show(null);
    }
}
