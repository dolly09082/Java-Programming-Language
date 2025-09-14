package OOPs.Polymorphism;

public class Case4 {
    
    void Show(int a,float b){
        System.out.println("int float Method");
    }
    void Show(float a,int b){
        System.out.println("float int Method");
    }
    public static void main(String[] args) {
        Case4 c1=new Case4();
        c1.Show(5,7.88f );
        c1.Show(7.88f,7 );
        // c1.Show("abc",5);
        //c1.Show(10,7 );

    }
}
