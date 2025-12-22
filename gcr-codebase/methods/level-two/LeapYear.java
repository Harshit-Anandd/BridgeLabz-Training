// Create class LeapYear that checks if a year is a leap year

import java.util.Scanner;
public class LeapYear {

    // Method to check for Leap Year
    public boolean isLeapYear(int year) {

        // Condition a: Year must be >= 1582
        if (year < 1582) {
            System.out.println("The year must be >= 1582 (Gregorian calendar start).");
            return false;
        }

        // Condition b: Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeap;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Create instance of LeapYear and check
        LeapYear checker = new LeapYear();
        boolean result = checker.isLeapYear(year);

        // Display result
        if (result) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner stream
        sc.close();
    }
}