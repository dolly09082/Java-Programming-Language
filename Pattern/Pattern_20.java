package Pattern;
public class Pattern_20 {
    public static void main(String[] args) {
        int j;
        for(int i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
                for(int k=i-1;k>=1;k--){
                    System.out.print(k);
                }
                System.out.println("");
            }
        }
    }

