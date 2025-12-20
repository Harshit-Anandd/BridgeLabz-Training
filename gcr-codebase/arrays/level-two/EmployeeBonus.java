//Create class EmployeeBonus that calculates bonuses for employees based on their years of service.

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Arrays to store salaries, years of service, new salaries and bonuses
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        // Variables to store totals
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        
        // Input salaries and years of service, calculate bonuses and new salaries
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter salary and years for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            double yr = sc.nextDouble();
            
            // Validate input
            if (sal < 0 || yr < 0) {
                System.out.println("Invalid input.");
                i--; continue;
            }

            // Store values in arrays
            salaries[i] = sal;
            years[i] = yr;
            
            // Calculate bonus and new salary
            double rate = (yr > 5) ? 0.05 : 0.02;
            bonuses[i] = sal * rate;
            newSalaries[i] = sal + bonuses[i];
            
            // Update totals
            totalBonus += bonuses[i];
            totalOld += sal;
            totalNew += newSalaries[i];
        }
        
        // Print totals
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);

        // Close the scanner stream
        sc.close();
    }
}