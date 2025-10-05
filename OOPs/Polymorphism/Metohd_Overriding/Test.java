package OOPs.Polymorphism.Metohd_Overriding;

abstract class Test {
    abstract void show();  // only abstract
}

class Xyz extends Test {
    @Override
    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        // Test t = new Test();  ❌ Not allowed

        Test t = new Xyz();   // ✅ reference of parent, object of child
        t.show();             // prints "2"

        Xyz x1 = new Xyz();   // ✅ direct child object
        x1.show();            // prints "2"
    }
}
