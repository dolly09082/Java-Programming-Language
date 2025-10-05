package OOPs.Polymorphism.Metohd_Overriding;

public class Case1 {
    Object show(){
        System.out.println("1");
        return null;  // must return something since return type is Object
    }
}

class Xyz extends Case1 {
    @Override
    String show(){   // covariant return type (String is a subclass of Object)
        System.out.println("2");
        return "Hello";  // must return a String
    }

    public static void main(String[] args) {
        Xyz x1 = new Xyz();
        x1.show();   // prints "2"
    }
}
