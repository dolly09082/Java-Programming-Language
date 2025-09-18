import java.util.*;
public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enput number :");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            int min =i;
            int temp;
            //int j=i;
        
        for( int j=i+1;j<a.length;j++){
            
            if(a[j]< a[min]){
                min =j;
            }
        }
         temp = a[min];
         a[min] = a[i];
         a[i] = temp; 
            
    }
    System.out.println("After Sorted :");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
        
    }
    
}
