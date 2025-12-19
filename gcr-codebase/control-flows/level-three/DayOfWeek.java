// Create a class DayOfWeek that calculates the day of the week for a given date

public class DayOfWeek {
    public static void main(String[] args) {
        
		// Get input for month, day, year
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Apply Gregorian calendar formulas
        // y0 = y - (14 - m) / 12
        int y0 = y - (14 - m) / 12;
        
        // x = y0 + y0/4 - y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // m0 = m + 12 * ((14 - m) / 12) - 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // d0 = (d + x + 31 * m0 / 12) % 7
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
    }
}