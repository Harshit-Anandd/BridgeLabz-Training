//Create class YoungestAndTallest that takes the ages and heights of three friends (Amar, Akbar, and Anthony) as input and determines who is the youngest and who is the tallest among them.

import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Input for Amar
        System.out.println("Enter Amar's age and height:");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        // Input for Akbar
        System.out.println("Enter Akbar's age and height:");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        // Input for Anthony
        System.out.println("Enter Anthony's age and height:");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        // Find Youngest (Minimum Age)
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.print("Youngest Friend(s): ");
        if (minAge == ageAmar) System.out.print("Amar ");
        if (minAge == ageAkbar) System.out.print("Akbar ");
        if (minAge == ageAnthony) System.out.print("Anthony ");
        System.out.println(); // New line

        // Find Tallest (Maximum Height)
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.print("Tallest Friend(s): ");
        if (maxHeight == heightAmar) System.out.print("Amar ");
        if (maxHeight == heightAkbar) System.out.print("Akbar ");
        if (maxHeight == heightAnthony) System.out.print("Anthony ");
        System.out.println();

        // Close the scanner stream
        sc.close();
    }
}