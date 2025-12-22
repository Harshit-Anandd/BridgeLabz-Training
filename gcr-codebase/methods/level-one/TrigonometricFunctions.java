// Create class TrigonometricFunctions that contains a method to calculate sine, cosine, and tangent of an angle in degrees.

import java.util.Scanner;
public class TrigonometricFunctions {

    // Method to calculate trig functions
    // Returns array [sine, cosine, tangent]
    public double[] calculateTrigonometricFunctions(double angleInDegrees) {

        // Convert degrees to radians
        double radians = Math.toRadians(angleInDegrees);

        // Calculate functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        double[] result = new double[3];
        result[0] = sine;
        result[1] = cosine;
        result[2] = tangent;

        // Returning the array containing sine, cosine, and tangent
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input angle
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Create TrigonometricFunctions object and calculate trig functions
        TrigonometricFunctions trig = new TrigonometricFunctions();
        double[] results = trig.calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        
        // Close the scanner stream
        sc.close();
    }
}