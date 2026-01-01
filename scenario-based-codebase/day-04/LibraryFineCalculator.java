// Create class LibraryFineCalculator that tracks book return dates and calculates fines

import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Variables to track fines
        final int FINE_PER_DAY = 5;
        int totalBooks = 5;
        int totalFine = 0;

        System.out.println("--- Library Fine Calculator ---");
        System.out.println("Please enter dates as day of the month (e.g., 1 to 31).");

        // Loop for 5 books
        for (int i = 1; i <= totalBooks; i++) {
            System.out.println("\nBook #" + i + ":");

            System.out.print("Enter Due Date (Day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (Day): ");
            int returnDate = sc.nextInt();

            // Check if book is late
            if (returnDate > dueDate) {
                int overdueDays = returnDate - dueDate;
                int fine = overdueDays * FINE_PER_DAY;

                System.out.println("Status: LATE (" + overdueDays + " days overdue)");
                System.out.println("Fine for Book #" + i + ": Rs. " + fine);

                // Add to total fine
                totalFine += fine;
            } else {
                System.out.println("Status: Returned On Time. No Fine.");
            }
        }

        // Display Fine Summary
        System.out.println("\n===========================");
        if (totalFine > 0) {
            System.out.println("Total Fine to Collect: Rs. " + totalFine);
            System.out.println("Please remind the member to pay.");
        } else {
            System.out.println("Great! No fines for this member.");
        }
        System.out.println("===========================");

        // Close the scanner stream
        sc.close();
    }
}