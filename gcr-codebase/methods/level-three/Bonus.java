// Create class Bonus that calculates employee bonuses based on their salary and years of service.

import java.util.Scanner;
public class Bonus {

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] empData) {

        // empData[i][0] = salary, empData[i][1] = years
        double[][] results = new double[empData.length][2]; // [0] = newSalary, [1] = bonus
        
        // Calculate bonus and new salary
        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            
            results[i][1] = bonus;
            results[i][0] = salary + bonus;
        }

        // Return new salary and bonus
        return results;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        double[][] empData = new double[10][2];

        // Generate Random Data
        for (int i = 0; i < 10; i++) {
            empData[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            empData[i][1] = (int)(Math.random() * 10) + 1; // 1-10 years
        }

        // Calculate bonuses
        double[][] results = calculateBonus(empData);

        // Display results
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("ID\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", (i+1), empData[i][0], empData[i][1], results[i][1], results[i][0]);
            totalOld += empData[i][0];
            totalBonus += results[i][1];
            totalNew += results[i][0];
        }
        System.out.println("------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);

        // Close the scanner stream
        sc.close();
    }
}