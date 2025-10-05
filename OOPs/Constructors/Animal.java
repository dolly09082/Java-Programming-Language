package OOPs.Constructors;

public class Animal {
    int age;
    String Name;
    public Animal(int a,String name){
        System.out.println("Hello Daulat");
        age = a;
        Name = name;
    }
    
     void Name1(){
        System.out.println(age);
        System.out.println(Name);
     }
    

    
    public static void main(String[] args) {
        Animal a1 = new Animal(25,"Dolly");
        Animal a2 = new Animal(5,"Polly");
        a2.Name="Khsuhsi";
        a1.Name1();
        a2.Name1();
       
        
    }
}
