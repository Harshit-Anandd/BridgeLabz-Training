//Create class EmployeeBonus that calculates the bonus for an employee based on years of service.

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get salary and years of service
        System.out.print("Enter current salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        double yearsOfService = sc.nextDouble();

        // Initialize bonus amount
        double bonus = 0;

        // Check if eligible for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        // Close the scanner stream
        sc.close();
    }
}