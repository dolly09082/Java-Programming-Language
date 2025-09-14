package OOPs.Inheritance;

public class Animal {
    void eat(){
        System.out.println("I am eating");
    }
}
 class Dog extends Animal{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }

 }
    

