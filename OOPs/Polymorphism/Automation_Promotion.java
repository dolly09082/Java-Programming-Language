package OOPs.Polymorphism;

public class Automation_Promotion {
    void Show(int a){
        System.out.println("Hello");
    }
    void Show(String a){
        System.out.println("Hello Dolly");

    }
    void Show(float a){
        System.out.println("Hello Prajapati ji");

    }
    public static void main(String[] args) {
        Automation_Promotion A1 = new Automation_Promotion();
        A1.Show(5);
        A1.Show("Hello");
        A1.Show('a'); //char covert into Int (By Automation Promotion)
        A1.Show(8.5f);

    }
    
}
