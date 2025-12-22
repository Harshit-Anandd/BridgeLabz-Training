// Create class SpringSeason that contains a method to check if it is Spring Season based on month and day.

import java.util.Scanner;
public class SpringSeason {

    // Method to check if it is Spring Season
    public boolean isSpringSeason(int month, int day) {
        
        // Spring is March (3) 20 to June (6) 20
        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true; // Late March
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true; // April
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true; // May
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true; // Early June
        }
        
        // Returning whether it is Spring Season
        return isSpring;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input month
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Input day
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Create SpringSeason object and check if it's Spring Season
        SpringSeason seasonChecker = new SpringSeason();
        boolean isSpring = seasonChecker.isSpringSeason(month, day);

        // Display result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner stream
        sc.close();
    }
}