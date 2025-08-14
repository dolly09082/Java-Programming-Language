package Array_Practice;
import java.util.*;
public class TwoDArrays{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a=new int [r][c];
    
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        int x=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==x){
                System.out.print("x found at locations("+i+","+j+")");
                }
            }
           // System.out.println();
    }
}
}