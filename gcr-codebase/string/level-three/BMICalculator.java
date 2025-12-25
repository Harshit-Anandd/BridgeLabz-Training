// Create class BMICalculator that calculates BMI and determines health status for multiple persons

import java.util.Scanner;
public class BMICalculator {

    // Method to get health status based on BMI
    public String getStatus(double bmi) {
	if (bmi <= 18.4) {
		// Return the results
		return "Underweight";
	} if (bmi < 25) {
		// Return the results
		return "Normal";
	} if (bmi < 40) {
		// Return the results
		return "Overweight";
	}

	// Return the results
	return "Obese";
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // Weight, Height(cm)
        BMICalculator calculator = new BMICalculator();

		// Input loop to get weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i+1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

		// Display the result
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (double[] person : data) {
            double heightM = person[1] / 100.0;
            double bmi = person[0] / (heightM * heightM);
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", 
                person[0], person[1], bmi, calculator.getStatus(bmi));
        }
		
		// Close the scanner stream
        sc.close();
    }
}