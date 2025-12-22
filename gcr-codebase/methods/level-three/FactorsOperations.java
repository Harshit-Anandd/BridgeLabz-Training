// Create class FactorsOperations that finds factors of a number and performs sum, product, and product of cubes operations.

import java.util.Scanner;
public class FactorsOperations {

    // Method to find factors
    public static int[] findFactors(int n) {

        // Count factors first
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }

        // Return the array of factors
        return factors;
    }

    // Method to sum factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }


        // Return the sum of factors
        return sum;
    }

    // Method to find product
    public static long productFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;

        // Return the product of factors
        return prod;
    }

    // Method to find product of cubes
    public static double productCubeFactors(int[] factors) {
        double prod = 1;
        for (int f : factors) {
            prod *= Math.pow(f, 3);
        }

        // Return the product of cubes of factors
        return prod;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Find factors
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Perform operations
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productCubeFactors(factors));

        // Close the scanner stream
        sc.close();
    }
}