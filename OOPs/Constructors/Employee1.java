package OOPs.Constructors;

public class Employee1 {
    String name;
    int roll;
    public Employee1(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public  Employee1(){
        this.name="Default";
        this.roll=0;

    }
    public Employee1(String name){
        this.name=name;
    }
    public void Emp(){
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        Employee1 E1=new Employee1("Dolly",1);
        Employee1 E2=new Employee1("Radhika",2);
        E1.Emp();
        E2.Emp();
         Employee1 E3=new Employee1();
         E3.Emp();
         Employee1 E4=new Employee1("Radha");
         E4.Emp();
       


    }
}
