//Create class BMICalculator2D that calculates BMI for multiple persons using a 2D array and categorizes them.

import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        // Create a 2D array to store weight, height, and BMI
        // [i][0] = weight, [i][1] = height, [i][2] = bmi
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        // Input weights and heights, calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            System.out.print("Weight and Height for person " + (i+1) + ": ");
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            
            // Calculate BMI and store in 2D array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            // Determine status based on BMI
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print BMI and status for each person
        for(int i=0; i<n; i++) {
            System.out.println("Person " + (i+1) + ": BMI=" + personData[i][2] + " Status=" + weightStatus[i]);
        }

        // Close the scanner stream
        sc.close();
    }
}