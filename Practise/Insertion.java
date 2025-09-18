public class Insertion {
    public static void main(String[] args) {
        int a[] = {3,5,9,7,1};
        System.out.println("Unsorted Array :");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int j=i-1;
        
        while( j>=0 && curr<a[j]){
            a[j+1]=a[j];
            j--;

        }
          a[j+1]=curr;
           
    }
    System.out.println("After Sorted Array: ");
    for(int i=0;i<a.length;i++){
    System.out.print(a[i]+ " ");
    }

    }
    
}
