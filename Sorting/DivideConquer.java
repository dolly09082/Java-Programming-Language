import java.util.Scanner;

public class DivideConquer {

    static int count = 0;

    
    static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n]; 
        count++; 
        for (int i = 0; i < n; i++) { 
            count++;
            for (int j = 0; j < n; j++) { 
                
                count++;
                C[i][j] = A[i][j] + B[i][j]; 
                count++;
            }
        }
        return C;
    }

   
    static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n]; 
        count++;
        for (int i = 0; i < n; i++) { 
            count++;
            for (int j = 0; j < n; j++) { 
                count++;
                C[i][j] = A[i][j] - B[i][j]; 
                count++;
            }
        }
        return C;
    }

    // Recursive function for matrix multiplication
    static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length; 
        count++;
        int[][] C = new int[n][n]; 
        count++;

        if (n == 1) { count++;
            C[0][0] = A[0][0] * B[0][0]; 
            count++;
        } else {
            int newSize = n / 2; 
            count++;

            int[][] A11 = new int[newSize][newSize]; count++;
            int[][] A12 = new int[newSize][newSize]; count++;
            int[][] A21 = new int[newSize][newSize]; count++;
            int[][] A22 = new int[newSize][newSize]; count++;

            int[][] B11 = new int[newSize][newSize]; count++;
            int[][] B12 = new int[newSize][newSize]; count++;
            int[][] B21 = new int[newSize][newSize]; count++;
            int[][] B22 = new int[newSize][newSize]; count++;

            // Split matrices
            for (int i = 0; i < newSize; i++) { count++;
                for (int j = 0; j < newSize; j++) { count++;
                    A11[i][j] = A[i][j]; 
                    count++;
                    A12[i][j] = A[i][j + newSize]; 
                    count++;
                    A21[i][j] = A[i + newSize][j];
                     count++;
                    A22[i][j] = A[i + newSize][j + newSize]; count++;

                    B11[i][j] = B[i][j]; count++;
                    B12[i][j] = B[i][j + newSize];
                     count++;
                    B21[i][j] = B[i + newSize][j]; 
                    count++;
                    B22[i][j] = B[i + newSize][j + newSize]; 
                    count++;
                }
            }

            // Recursive multiplications
            int[][] C11 = add(multiply(A11, B11), multiply(A12, B21)); count++;
            int[][] C12 = add(multiply(A11, B12), multiply(A12, B22)); count++;
            int[][] C21 = add(multiply(A21, B11), multiply(A22, B21)); count++;
            int[][] C22 = add(multiply(A21, B12), multiply(A22, B22)); count++;

            // Combine results
            for (int i = 0; i < newSize; i++) { 
                count++;
                for (int j = 0; j < newSize; j++) { 
                    count++;
                    C[i][j] = C11[i][j]; count++;
                    C[i][j + newSize] = C12[i][j]; 
                    count++;
                    C[i + newSize][j] = C21[i][j]; 
                    count++;
                    C[i + newSize][j + newSize] = C22[i][j]; count++;
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); count++;

        System.out.print("Enter size of matrix (power of 2, e.g., 2, 4, 8, 16): "); count++;
        int n = sc.nextInt(); count++;

        int[][] A = new int[n][n]; count++;
        int[][] B = new int[n][n]; count++;

        System.out.println("Enter first matrix:"); count++;
        for (int i = 0; i < n; i++) { count++;
            for (int j = 0; j < n; j++) { count++;
                A[i][j] = sc.nextInt(); count++;
            }
        }

        System.out.println("Enter second matrix:"); count++;
        for (int i = 0; i < n; i++) { count++;
            for (int j = 0; j < n; j++) { count++;
                B[i][j] = sc.nextInt(); count++;
            }
        }

        int[][] C = multiply(A, B); count++;

        System.out.println("Resultant Matrix:"); count++;
        for (int i = 0; i < n; i++) { count++;
            for (int j = 0; j < n; j++) { count++;
                System.out.print(C[i][j] + " "); count++;
            }
            System.out.println(); count++;
        }

        System.out.println("Total steps executed (count): " + count); count++;

        sc.close(); count++;
    }
}
