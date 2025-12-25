// Create class MaxOfThree that finds the maximum of three numbers

import java.util.Scanner;
public class MaxOfThree {

	// Method to find the maximum of three numbers
	public int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		// Return the results
		return max;
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		// Create the object and call the method
		MaxOfThree calculator = new MaxOfThree();

		// Display the result
		System.out.println("Maximum: " + calculator.findMax(n1, n2, n3));

		// Close the scanner stream
		sc.close();
	}
}