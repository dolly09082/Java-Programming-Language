import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Size of Array");
        int n=sc.nextInt();
        int temp;
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            
        }
        

        System.out.println("After sorted :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
