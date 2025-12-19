// Create class BasicCalculator that performs basic arithmetic operations

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        // Ask the user for the second number
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        // Print the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + additionResult + ", " + subtractionResult + ", " + multiplicationResult + ", and " + divisionResult);
        
        // Close the scanner stream
        sc.close();
    }
}