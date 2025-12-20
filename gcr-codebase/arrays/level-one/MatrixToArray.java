//Create class MatrixToArray that takes a 2D matrix as input, converts it to a 1D array, and displays the array.

import java.util.Scanner;
public class MatrixToArray {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter matrix dimensions
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        
        // Initialize the matrix and array
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        
        // Read matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Convert 2D matrix to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Print the 1D array
        System.out.print("1D Array: ");
        for (int val : array) System.out.print(val + " ");

        // Close the scanner stream
        sc.close();
    }
}