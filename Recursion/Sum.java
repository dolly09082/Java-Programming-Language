package Recursion;

public class Sum {
    public static void firstSum(int i,int n,int sum){
    
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        firstSum(i+1,n,sum);
    }

    public static void main(String[] args) {
        firstSum(1,5,0);
    }
}
