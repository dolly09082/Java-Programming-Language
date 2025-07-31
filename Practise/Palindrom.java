public class Palindrom {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int x;
        int rev = 0;

        while(n > 0){
            x = n % 10;
            rev = rev * 10 + x;
            n = n / 10;
        }

        if(temp == rev){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
