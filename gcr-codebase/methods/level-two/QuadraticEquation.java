// Create class QuadraticEquation to find roots of a quadratic equation

import java.util.Scanner;
public class QuadraticEquation {

    // Method to find roots
    public void findRoots(double a, double b, double c) {
        // Calculate Delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            // No real roots
            System.out.println("No real roots (Delta is negative)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Create object and solve
        QuadraticEquation equation = new QuadraticEquation();
        equation.findRoots(a, b, c);

        // Close the scanner stream
        sc.close();
    }
}