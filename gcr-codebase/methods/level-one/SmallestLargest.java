// Create class SmallestLargest that contains a method to find the smallest and largest among three numbers.

import java.util.Scanner;
public class SmallestLargest {

    // Method to find smallest and largest
    // Returns an array where index 0 is smallest and index 1 is largest
    public int[] findSmallestAndLargest(int number1, int number2, int number3) {

        // Initialize smallest and largest with the first number
        int smallest = number1;
        int largest = number1;

        // Check against number2
        if (number2 < smallest) {
			smallest = number2;
		} if (number2 > largest) {
			largest = number2;
		}

        // Check against number3
        if (number3 < smallest) {
			smallest = number3;
		} if (number3 > largest) {
			largest = number3;
		}

        // Return results in an array
        int[] result = {smallest, largest};

        // Returning the array containing smallest and largest numbers
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        // Create SmallestLargest object and find smallest and largest
        SmallestLargest finder = new SmallestLargest();
        int[] results = finder.findSmallestAndLargest(num1, num2, num3);

        // Display results
        System.out.println("Smallest number: " + results[0]);
        System.out.println("Largest number: " + results[1]);
        
        // Close the scanner stream
        sc.close();
    }
}