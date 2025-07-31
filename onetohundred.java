public class onetohundred {
    public static void main(String args[]){
        int j;
        int c=0;
        int d=0;
        for(int i=2;i<=100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                   // System.out.println("No is notprime " +i);
                   d++;
                    break;
                    
                }
                
            }
            if(i==j){
               // System.out.println("No is prime " +i);
                c++;
            }
        }
        System.out.println("total prime no: " +c);
        System.out.println("total nonprime no: " +d);
    }
   
}
