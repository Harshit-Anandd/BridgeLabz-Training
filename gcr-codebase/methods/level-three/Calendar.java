// Create class Calendar that displays the calendar for a given month and year.

import java.util.Scanner;
public class Calendar {

    // Month names
    static String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    // Days in months
    static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Leap Year Check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get Start Day (0=Sun, 1=Mon, ...)
    public static int getStartDay(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Return the start day
        return d0;
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        // Adjust for leap year
        if (m == 2 && isLeapYear(y)) daysInMonth[2] = 29;

        // Get start day for day 1
        int startDay = getStartDay(m, 1, y);

        // Header
        System.out.println("\n   " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indentation
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop for days
        for (int i = 1; i <= daysInMonth[m]; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();

        // Close the scanner stream
        sc.close();
    }
}