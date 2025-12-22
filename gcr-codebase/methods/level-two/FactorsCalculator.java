// Create class FactorsCalculator that calculates factors of a number

import java.util.Scanner;
public class FactorsCalculator {

    // Method to find factors of a number
    // Returns an array containing the factors
    public int[] findFactors(int number) {
        int count = 0;

        // First loop: Count the number of factors to initialize the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with the count size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: Save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return the array of factors
        return factors;
    }

    // Method to find the sum of factors
    public int sumFactors(int[] factors) {

        // Initialize sum variable
        int sum = 0;

        // Loop through the factors and add to sum
        for (int factor : factors) {
            sum += factor;
        }

        // Return the sum
        return sum;
    }

    // Method to find the product of factors
    public long productFactors(int[] factors) {

        // Initialize product variable
        long product = 1;

        // Loop through the factors and multiply to product
        for (int factor : factors) {
            product *= factor;
        }

        // Return the product
        return product;
    }

    // Method to find the sum of squares of factors
    public double sumSquareFactors(int[] factors) {

        // Initialize sumSquare variable
        double sumSquare = 0;

        // Loop through the factors and add square to sumSquare
        for (int factor : factors) {
            // Using Math.pow to square the factor
            sumSquare += Math.pow(factor, 2);
        }

        // Return the sum of squares
        return sumSquare;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Create instance of FactorsCalculator
        FactorsCalculator calculator = new FactorsCalculator();

        // Get factors array
        int[] factors = calculator.findFactors(number);

        // Display factors
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display Sum
        int sum = calculator.sumFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate and display Product
        long product = calculator.productFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calculate and display Sum of Squares
        double sumSquares = calculator.sumSquareFactors(factors);
        System.out.println("Sum of squares of factors: " + sumSquares);

        // Close the scanner stream
        sc.close();
    }
}