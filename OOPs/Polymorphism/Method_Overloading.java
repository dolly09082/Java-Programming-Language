package OOPs.Polymorphism;

public class Method_Overloading {
    void Show(String a,int b){
        System.out.println("1");

    }
    void Show(int a,String b){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Method_Overloading m1=new Method_Overloading();
        m1.Show(5,"Hii");
        m1.Show("Hii",4);
    }
    
}
