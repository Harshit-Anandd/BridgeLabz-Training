// Create class SquareSideCalculator that calculates the side length of a square given its perimeter

import java.util.Scanner;
public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Take user input for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the side length (Perimeter = 4 * side => side = Perimeter / 4)
        double sideLength = perimeter / 4;

        // Print the output
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
            
        // Close the scanner stream
        sc.close();
    }
}