// Create a class BMICalculator that calculates BMI and determines weight status

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get weight in kg
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Get height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI: weight / (height * height)
        double bmi = weight / (heightMeters * heightMeters);

        // Determine status based on BMI table
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi < 25.0) { // Covers 18.5 to 24.9
            status = "Normal";
        } else if (bmi < 40.0) { // Covers 25.0 to 39.9
            status = "Overweight";
        } else { // >= 40.0
            status = "Obese";
        }

        // Display result
        System.out.println("Your BMI is " + bmi + " and your status is " + status);

        // Close the scanner stream
        sc.close();
    }
}