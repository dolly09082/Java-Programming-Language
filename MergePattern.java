public class MergePattern {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int i,j;
        for(i=0;i<=r;i++){
            for(j=0;j<=i;j++){
            System.out.print("*");

            }
            System.out.println();
        }
        for(i=1;i<=r;i++){
            for(j=0;j<=c-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
