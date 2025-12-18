//Program to calculate the area of a triangle in square inches and square centimeters

import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {

        //Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter base and height of the triangle
        System.out.println("Enter base and height of the triangle in inches : ");

        //Read base of triangle in inches
        double baseInInches = sc.nextDouble();

        //Read height of triangle in inches
        double heightInInches = sc.nextDouble();

        //Calculate area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        //Conversion factor from inch to cm
        double inchToCm = 2.54;

        // Convert area to square centimeters
        double areaInSquareCm = areaInSquareInches * inchToCm * inchToCm;

        //Display output
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters");

        //Close Scanner Stream
        sc.close();
    }
}
