package Pattern;
public class pattern_9 {
    public static void main(String[] args) {

        for(int m=1;m<=4;m++){
            for(int n=1;n<=m;n++){
            System.out.print(" ");      

            }
            for(int o=4;o>=m;o--){
                System.out.print("*");
                
            }
            for(int p=3;p>=m;p--){
                System.out.print("*");
            }
            System.err.println("");
        }
    }
    
}
