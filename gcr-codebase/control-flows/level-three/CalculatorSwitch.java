//Create class CalculatorSwitch that takes two numbers and an operator (+, -, *, /) as input and prints the result based on the operator using switch case.

import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Get second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0;
        boolean validOp = true;

        // Switch case based on operator
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero.");
                    validOp = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOp = false;
        }

        // Print result if operator was valid
        if (validOp) {
            System.out.println("Result: " + result);
        }

        // Close the scanner stream
        sc.close();
    }
}