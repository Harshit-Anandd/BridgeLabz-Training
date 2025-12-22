// Create class MatrixAdvanced that performs advanced matrix operations such as transpose, determinant, and inverse for 2x2 and 3x3 matrices.

import java.util.Scanner;
public class MatrixAdvanced {

    // Create Random Matrix
    public static double[][] createRandomMatrix(int size) {

        // Generate random matrix
        double[][] m = new double[size][size];

        // Fill matrix with random integers 0-9
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                m[i][j] = (int)(Math.random() * 10);
            }
        }

        // Return matrix
        return m;
    }

    // Transpose 
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m.length][m.length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                t[j][i] = m[i][j];
            }
        }

        // Return transposed matrix
        return t;
    }

    // Determinant 2x2
    public static double det2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant 3x3 
    public static double det3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse 2x2 
    public static void inverse2x2(double[][] m) {
        double det = det2x2(m);
        if(det == 0) { 
            System.out.println("Inverse not possible (Det=0)"); return; 
        }

        // Calculate inverse
        System.out.println("Inverse 2x2:");
        System.out.println((m[1][1]/det) + "\t" + (-m[0][1]/det));
        System.out.println((-m[1][0]/det) + "\t" + (m[0][0]/det));
    }

    // Inverse 3x3 (Using Cofactors/Adjoint) 
    public static void inverse3x3(double[][] m) {
        // Calculate determinant
        double det = det3x3(m);
        if(det == 0) { System.out.println("Inverse not possible (Det=0)"); return; }

        // Calculate inverse using adjoint method
        System.out.println("Inverse 3x3 (Calculated via Adjoint/Det):");

        // Print cofactor matrix divided by determinant
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                // Determine sub-matrix for cofactor
                // This is a simplified print for demonstration given complexity
                System.out.printf("%.2f ", ((m[(j+1)%3][(i+1)%3] * m[(j+2)%3][(i+2)%3]) - (m[(j+1)%3][(i+2)%3] * m[(j+2)%3][(i+1)%3]))/ det);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Demonstrate matrix operations
        System.out.println("--- 2x2 Matrix ---");
        double[][] m2 = createRandomMatrix(2);
        System.out.println("Determinant: " + det2x2(m2));
        inverse2x2(m2);
        System.out.println("\n--- 3x3 Matrix ---");
        double[][] m3 = createRandomMatrix(3);
        System.out.println("Determinant: " + det3x3(m3));
        inverse3x3(m3);
        
        // Close the scanner stream
        sc.close();
    }
}