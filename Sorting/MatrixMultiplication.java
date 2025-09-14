import java.util.*;

public class MatrixMultiplication {

    static int[][] multiplyMatrices(int[][] A, int[][] B, int m, int n, int q) {
        int[][] C = new int[m][q];
        int count = 0;

        for (int i = 0; i < m; i++) {
            count++;
            for (int j = 0; j < q; j++) {
                count++;
                C[i][j] = 0;
                count++;
                for (int k = 0; k < n; k++) {
                    count++;
                    C[i][j] += A[i][k] * B[k][j];
                    count += 2;
                }
                count++;
            }
            count++;
        }
        count++;

        System.out.println("Total operation count = " + count);
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of first matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Enter rows and columns of second matrix:");
        int p = sc.nextInt();
        int q = sc.nextInt();

        if (n != p) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[m][n];
        int[][] B = new int[p][q];

        System.out.println("Enter values of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values of second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = multiplyMatrices(A, B, m, n, q);

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
