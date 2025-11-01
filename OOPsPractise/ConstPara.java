package OOPsPractise;

public class ConstPara {
    String name;
    int age;

    public ConstPara(String n,int a){
        name = n;
        age = a;
    }
    public void para(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        ConstPara c1 = new ConstPara( "Dolly", 21);
        ConstPara c2 = new ConstPara("Radha", 22);
          c1.para(); 
          c2.para();  
        
        
    }
          
    } 

