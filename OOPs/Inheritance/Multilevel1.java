package OOPs.Inheritance;

// Parent class
class Multilevel1 {
    public void Sheema() {
        System.out.println("Hello Seema");
    }
}

// Child class of Multilevel1
class Multilevel2 extends Multilevel1 {
    public void Reena() {
        System.out.println("Hello Reena");
    }
}

// Child class of Multilevel2 (grandchild of Multilevel1)
class Multilevel3 extends Multilevel2 {
    public void Meena() {
        System.out.println("Hello Meena");
    }

    // Main method
    public static void main(String[] args) {
        // Create object of Multilevel3
        Multilevel3 obj = new Multilevel3();

        // Call all methods (inherited + own)
        obj.Sheema();  // from Multilevel1
        obj.Reena();   // from Multilevel2
        obj.Meena();   // from Multilevel3
    }
}
