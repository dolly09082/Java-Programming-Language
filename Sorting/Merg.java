public class Merg {
    static int c=0;
static void MergeSort(int a[],int st,int end){
    c++;
    c++;
    if(st<end){
        c++;
        int mid=(st+end)/2;
        c++;
        MergeSort(a,st,mid);
        c++;
        MergeSort(a,mid+1,end);
        c++;
        merge(a,st,mid,end);
        c++;

    }
}
static void merge(int a[],int st,int mid,int end){
    c++;
    int temp[]=new int[end-st+1];
    c++;
    int i=st;
    c++;
    int j=mid+1;
    c++;
    int k=0;
    c++;
    c++;
    while(i<=mid && j<=end){
        c++;
        c++;
        if(a[i]<=a[j]){
            c++;
            temp[k++]=a[i++];
            c++;
        }
        else{
            c++;
            temp[k++]=a[j++];
            c++;
            
        }
    }
    c++;
    while(i<=mid){
        c++;
        temp[k++]=a[i++];
        c++;
    }
    c++;
    while(j<=end){
        c++;
        temp[k++]=a[j++];
        c++;
    }
    c++;
    c++;
    for(int idx=0;idx<temp.length;idx++){
        c++;
        a[st+idx]=temp[idx];
        c++;
    }
    c++;

}


    public static void main(String[] args) {
        
    //     int a[] = {5,4,3,2,1};
    // int n = 5;
    int a[] = {10,9,8,7,6,5,4,3,2,1};//worst
    int n=10;
    // int arr[] = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};//worst
    // int n = 15;    
    // int arr[] = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};//worst
    // int n = 20;
    // int arr[] = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};//worst
    // int n =25;
    // int arr[] = {30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};//worst
    // int n =30;
    // int arr[] = {1,2,3,4,5};//Best
    // int n=5;
    // int arr[] = {1,2,3,4,5,6,7,8,9,10};//Best
    // int n=10;
    // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};//Best
    // int n=15;
    // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//Best
    // int n=20;
    // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};//Best
    // int n=25;
    // int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};//Best
    // int n=30;
    // int arr[] = {7,13,2,25,9};//Average
    // int n=5;
    // int arr[] = {7,13,2,25,9,1,18,24,6,14};//Average
    // int n=10;
    // int arr[] = {7,13,2,25,9,1,18,24,6,14,22,5,3,10,20};//Average
    // int n=15;
    // int arr[] = {7,13,2,25,9,1,18,24,6,14,22,5,3,10,20,8,12,15,4,19};//Average
    // int n=20;
    // int arr[] = {7,13,2,25,9,1,18,24,6,14,22,5,3,10,20,8,12,15,4,19,11,16,23,17,21};//Average 
    // int n=25;
    // int arr[] = {7,13,2,25,9,1,18,24,6,14,22,5,3,10,20,8,12,15,4,19,11,16,23,17,21,56,2,34,12,4};//Average 
    // int n=30;
    MergeSort(a,0,a.length-1);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println("count is:"+c);
    }
    
}
