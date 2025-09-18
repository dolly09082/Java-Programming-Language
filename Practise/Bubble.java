public class Bubble {
    public static void main(String[] args) {
        int a[]={2,5,9,3,1};
        System.out.println("Unsorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(+a[i]+" ");
        }
        System.out.println();
       
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(+a[i]+" ");

        }

    }
    
}
