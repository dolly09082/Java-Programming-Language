import java.util.Scanner;

public class PrintNumbers {


    public static void printNumbersTill(int n) {
        int i = 1;
        do {
            System.out.println("Number: " + i);
            i++;
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printNumbersTill(num); 
    }
}
