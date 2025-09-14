package OOPs.Polymorphism;

public class VarArgs {
     void Show(int a){
        System.out.println("Integer Method");
     }
     void Show(int...a){
        System.out.println("Var Method");

     }
     public static void main(String[] args) {
        VarArgs a1=new VarArgs();
        a1.Show(10);
        a1.Show(10,20,20 ,38 ,39 ,30);
        a1.Show();
     }
    
}
