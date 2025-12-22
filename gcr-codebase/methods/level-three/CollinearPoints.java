// Create class CollinearPoints that checks if three points are collinear using two methods: slope comparison and area calculation.

import java.util.Scanner;
public class CollinearPoints {

    // Slope Check
    public static boolean checkSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Use multiplication to avoid division by zero: (y2-y1)*(x3-x2) == (y3-y2)*(x2-x1)
        double val1 = (y2 - y1) * (x3 - x2);
        double val2 = (y3 - y2) * (x2 - x1);

        // Return comparison result
        return val1 == val2;
    }

    // Area Check
    public static boolean checkArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        boolean areaIsZero = area == 0.0;

        // Return true if area is zero
        return areaIsZero;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.println("Enter x1, y1: ");
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        System.out.println("Enter x2, y2: ");
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        System.out.println("Enter x3, y3: ");
        double x3 = sc.nextDouble(); double y3 = sc.nextDouble();

        // Check collinearity using both methods
        boolean slopeCollinear = checkSlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = checkArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Collinear (Slope Method): " + slopeCollinear);
        System.out.println("Collinear (Area Method): " + areaCollinear);

        // Close the scanner stream
        sc.close();
    }
}