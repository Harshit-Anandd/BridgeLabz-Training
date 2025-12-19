// Create class TriangleAreaCalculator that calculates the area of a triangle given its base and height in centimeters, and converts the area to square inches

import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Constant for cm to inches conversion (1 inch = 2.54 cm)
        final double CM_PER_INCH = 2.54;

        // Take user input for base and height in cm
        System.out.print("Enter the base of the triangle (in cm): ");
        double baseInCm = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightInCm = sc.nextDouble();

        // Calculate area in square centimeters
        double areaInSqCm = 0.5 * baseInCm * heightInCm;

        // Calculate area in square inches
        // To convert sq cm to sq inches, we divide by (2.54 * 2.54)
        double areaInSqIn = areaInSqCm / (CM_PER_INCH * CM_PER_INCH);

        // Print the output
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);
        
        // Close the scanner stream
        sc.close();
    }
}