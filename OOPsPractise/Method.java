package OOPsPractise;

public class Method {
    String name;
    int age;
    public  void Self(String n,int a){
        name = n;
        age = a;
    }
    public  void display(){
        System.out.println(name +" "+age);
    }
    public static void main(String[] args) {
        Method m1 = new Method();
        m1.Self("Dolly",21);
        m1.display();
        
    }
    
}
