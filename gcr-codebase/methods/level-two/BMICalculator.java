// Create class BMICalculator that calculates BMI for 10 individuals

import java.util.Scanner;
public class BMICalculator {

    // Method to calculate BMI
    // Formula: weight (kg) / height (m)^2
    public double calculateBMI(double weight, double heightCm) {

        double heightMeters = heightCm / 100.0; // Convert cm to meters
        double bmi = weight / (heightMeters * heightMeters);

        // Return BMI value
        return bmi;
    }

    // Method to determine BMI Status
    public String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // 2D Array: 10 rows, 3 columns (Weight, Height, BMI)
        double[][] personData = new double[10][3];

        BMICalculator bmiCalc = new BMICalculator();

        // Input Data
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter Weight (kg): ");
            personData[i][0] = sc.nextDouble(); // Store Weight
            
            System.out.print("Enter Height (cm): ");
            personData[i][1] = sc.nextDouble(); // Store Height

            // Calculate BMI and store in 3rd column
            personData[i][2] = bmiCalc.calculateBMI(personData[i][0], personData[i][1]);
        }

        // Display Report
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            double bmi = personData[i][2];
            String status = bmiCalc.getBMIStatus(bmi);
            
            System.out.println("Person " + (i + 1) + " | Weight: " + personData[i][0] + " | Height: " + personData[i][1] + " | BMI: " + String.format("%.2f", bmi) + " | Status: " + status);
        }

        // Close the scanner stream
        sc.close();
    }
}