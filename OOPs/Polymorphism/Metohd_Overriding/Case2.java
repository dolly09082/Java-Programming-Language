package OOPs.Polymorphism.Metohd_Overriding;

public class Case2 {
   public Object show(){
   //protected Object show(){
        System.out.println("1");
        return null;
    }
    
}
class Case3 extends Case2{
    public String show(){
    //protected String show(){
        System.out.println("2");
        return "hello";
    }
    public static void main(String[] args) {
        Case3 c1 = new Case3();
        c1.show();
        
    }
}
