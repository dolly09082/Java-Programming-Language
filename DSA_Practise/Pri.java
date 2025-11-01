package DSA_Practise;

public class Pri {
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            if (prime(n)) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Not Prime");
            }
        }
    }
}
