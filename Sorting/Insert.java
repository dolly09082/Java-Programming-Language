import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Size of Array");
        int n=sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=1;i<a.length;i++){
            int current = a[i];
               int j = i-1;
            while(j>=0 && current<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;

        }
        System.out.println("After sorting array :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        } 
    }
    
}
