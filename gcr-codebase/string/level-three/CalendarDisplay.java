// Create class CalendarDisplay that displays a calendar for a given month and year

import java.util.Scanner;
public class CalendarDisplay {

    // Array of month names
    static String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    // Array of days in each month
    static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Method to get the starting day of the month using Zeller's algorithm
    public static int getStartDay(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the values
        System.out.print("Enter Month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();

		// Check for leap year and adjust days in February
        if (m == 2 && isLeapYear(y)) daysInMonth[2] = 29;

		// Get the starting day of the month
        int startDay = getStartDay(m, 1, y);

		// Display the calendar
        System.out.println("\n   " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) System.out.print("    ");

        for (int i = 1; i <= daysInMonth[m]; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
		// Close the scanner stream
        sc.close();
    }
}