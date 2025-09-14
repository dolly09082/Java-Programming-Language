package OOPs;

public class Employee {
    String name;
    int roll_no;
    public void emp(){
    System.out.println("name:"+name);
    System.out.println("roll_no:"+roll_no);
    }

    public static void main(String[] args) {
        Employee E1 =new Employee();
        E1.name="Dolly";
        E1.roll_no=1;
        E1.emp();

        Employee E2 =new Employee();
        E2.name="Kiran";
        E2.roll_no=2;
   
        E2.emp();

               
        
        
    }
    
}
