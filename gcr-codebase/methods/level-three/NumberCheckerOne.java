// Create class NumberCheckerOne that checks for Duck numbers, Armstrong numbers, and finds largest/smallest digits.

import java.util.Scanner;
public class NumberCheckerOne {

    // Count the number of digits in a number
    public static int countDigits(int number) {
        // Return the length of the number as string
        return String.valueOf(number).length();
    }

    // Extract digits from a number and store in array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        // Convert each character to numeric value
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        // Return the array of digits
        return digits;
    }

    // Check if number is a Duck number (contains a zero but doesn't start with it)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true; // Standard definition: contains a zero
        }
        
        // Return false if no zero found
        return false;
    }

    // Check if number is an Armstrong number (sum of digits raised to power of digit count equals number)
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        // Calculate sum of each digit raised to power
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        
        // Return true if sum equals the original number
        return sum == number;
    }

    // Find and display the largest and second largest digits
    public static void displayLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Track largest and second largest values
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }

    // Find and display the smallest and second smallest digits
    public static void displaySmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Track smallest and second smallest values
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        // Display results
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get digits from number
        int[] digits = getDigits(number);

        // Check and display Duck number result
        if (isDuckNumber(digits)) System.out.println("It is a Duck Number.");
        else System.out.println("It is not a Duck Number.");

        // Check and display Armstrong number result
        if (isArmstrong(number, digits)) System.out.println("It is an Armstrong Number.");
        else System.out.println("It is not an Armstrong Number.");

        // Display largest and smallest digits
        displayLargestTwo(digits);
        displaySmallestTwo(digits);
        
        // Close the scanner stream
        sc.close();
    }
}