 class Class_A {
    public static void Sunita(){
        System.out.println("Hello Sunita");

    }
}
    public class Class_B extends Class_A{
        public static void Meena(){
            System.out.println("How are you Meena");
        }

        public static void main(String[] args) {
            Class_B b1 = new Class_B();
            // b1.Sunita();
            b1.Meena();
        }
    }



    

