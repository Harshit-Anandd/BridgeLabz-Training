// Create class LineGeometry that calculates the distance between two points and finds the equation of the line passing through them.

import java.util.Scanner;
public class LineGeometry {

    // Calculate Distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Return distance
        return result;
    }

    // Find Equation (m and b)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        // Store slope and y-intercept in array
        double[] result = new double[2];
        result[0] = m;
        result[1] = b;

        // Return slope and y-intercept
        return result;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();

        // Calculate distance and equation
        double dist = calculateDistance(x1, y1, x2, y2);
        double[] eq = findLineEquation(x1, y1, x2, y2);

        // Display results
        System.out.println("Distance: " + dist);
        System.out.println("Equation: y = " + eq[0] + "x + " + eq[1]);

        // Close the scanner stream
        sc.close();
    }
}