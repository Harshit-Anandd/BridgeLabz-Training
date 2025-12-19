//Create class EmployeeBonus that calculates bonus based on years of service

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get salary input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Get years of service input
        System.out.print("Enter years of service: ");
        double yearsOfService = sc.nextDouble();

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus is awarded. Years of service must be more than 5.");
        }

        // Close the scanner stream
        sc.close();
    }
}