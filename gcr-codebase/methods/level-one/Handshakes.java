// Create clsass Handshakes that contains method to calculate number of handshakes

import java.util.Scanner;
public class Handshakes {

    // Method to calculate the number of handshakes
    public int calculateHandshakes(int n) {

		// Uses formula: (n * (n-1)) / 2
        int numberOfHandshakes = (n * (n - 1)) / 2;

		// Returning the calculated number of handshakes
        return numberOfHandshakes;
    }

    public static void main(String[] args) {
		
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create class object
        Handshakes obj = new Handshakes();

        // Calculate handshakes
        int handshakes = obj.calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes is: " + handshakes);

        // Close the scanner object
        sc.close();
    }
}