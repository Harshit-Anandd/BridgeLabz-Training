// Create class NumberAnalysis to analyze numbers

import java.util.Scanner;
public class NumberAnalysis {

    // Method to check if a number is positive
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create instance of NumberAnalysis
        NumberAnalysis analyzer = new NumberAnalysis();

        // Loop to analyze each number
        for (int number : numbers) {
            if (analyzer.isPositive(number)) {
                if (analyzer.isEven(number)) {
                    System.out.println(number + " is Positive and Even");
                } else {
                    System.out.println(number + " is Positive and Odd");
                }
            } else {
                System.out.println(number + " is Negative");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = analyzer.compare(first, last);

        // Display comparison result
        System.out.print("Comparison of First (" + first + ") and Last (" + last + "): ");
        if (comparisonResult == 1) {
            System.out.println("First is Greater");
        } else if (comparisonResult == 0) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("First is Less");
        }

        // Close the scanner stream
        sc.close();
    }
}