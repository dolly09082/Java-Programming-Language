import java.util.Scanner;

public class Max_Min {
  public static void findMinMax(int[] arr){
    int min=arr[0];
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }
    System.out.println("Min :"+min);
    for(int i=1;i<arr.length;i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }
    System.out.println("Max :"+max);
  }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array :");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    findMinMax(arr);
}
}
