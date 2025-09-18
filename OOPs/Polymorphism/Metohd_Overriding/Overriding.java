package OOPs.Polymorphism.Metohd_Overriding;

public class Overriding {
    void Show(String a,int b){
        System.out.println("Hii");
    }
}
    class Overriding1 extends Overriding{
        void Show(String a,int c){
            System.out.println("Hello");
        }
    
    public static void main(String[] args) {
       Overriding o1 =new Overriding();
        o1.Show("hii",6);
        Overriding1 o2 =new Overriding1(); //dusri method ko call nhi krega apne ko hi krega
        //dusri ko kr sakta h by super keyword
        o2.Show("Hiiiii",7);
    }
}

    

