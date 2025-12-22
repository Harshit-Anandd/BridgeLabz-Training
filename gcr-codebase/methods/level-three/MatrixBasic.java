// Create class MatrixBasic that performs basic matrix operations such as addition, subtraction, and multiplication.

import java.util.Scanner;
public class MatrixBasic {

    // Create random matrix with values 0-9
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        // Fill matrix with random integers 0-9
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                m[i][j] = (int)(Math.random() * 10);
        
        // Return the generated matrix
        return m;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        // Add corresponding elements
        for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				res[i][j] = a[i][j] + b[i][j];
			}
		}
        
        // Return the sum matrix
        return res;
    }

    // Subtract matrix b from matrix a
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        // Subtract corresponding elements
        for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				res[i][j] = a[i][j] - b[i][j];
			}
		}
        
        // Return the difference matrix
        return res;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
		
		// Store the 
        int rowsA = a.length, colsA = a[0].length, colsB = b[0].length;
        int[][] res = new int[rowsA][colsB];
        // Perform matrix multiplication
        for(int i=0; i<rowsA; i++) {
            for(int j=0; j<colsB; j++) {
                for(int k=0; k<colsA; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        // Return the product matrix
        return res;
    }

    // Print matrix in formatted manner
    public static void printMatrix(int[][] m) {
        for(int[] row : m) {
            for(int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Create two random 2x2 matrices
        int[][] a = createRandomMatrix(2, 2);
        int[][] b = createRandomMatrix(2, 2);

        // Display matrices
        System.out.println("Matrix A:"); printMatrix(a);
        System.out.println("Matrix B:"); printMatrix(b);

        // Perform and display matrix operations
        System.out.println("Addition:"); printMatrix(addMatrices(a, b));
        System.out.println("Subtraction:"); printMatrix(subtractMatrices(a, b));
        System.out.println("Multiplication:"); printMatrix(multiplyMatrices(a, b));
        
        // Close the scanner stream
        sc.close();
        
        // Close the scanner stream
        System.out.println("Addition:"); printMatrix(addMatrices(a, b));
        System.out.println("Subtraction:"); printMatrix(subtractMatrices(a, b));
        System.out.println("Multiplication:"); printMatrix(multiplyMatrices(a, b));
        sc.close();
    }
}