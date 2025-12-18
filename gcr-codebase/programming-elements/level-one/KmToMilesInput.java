//Program to convert distance from kilometers to miles with user input

import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter distance in kilometers
        System.out.println("Enter distance in kilometers : ");

        // Read kilometer input
        double km = sc.nextDouble();

        // Conversion
        double miles = km / 1.6;

        // Display output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close Scanner Stream
        sc.close();
    }
}