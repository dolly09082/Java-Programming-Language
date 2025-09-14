package OOPs;

public class Animal {

    public void eat() {
        System.out.println("I am eating");
    }
    public void Dog() {
        System.out.println("Dog is a Animal");
    }

    public static void main(String args[]) {
        Animal a1 = new Animal(); //default constructer
    
        a1.eat();
        a1.Dog();
        
        Animal a2 = a1; // copy constructer
        
            a2.eat();
            a2.Dog();



    }


}
