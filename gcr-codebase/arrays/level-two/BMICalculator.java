//Create class BMICalculator that calculates BMI for multiple persons and categorizes them.

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        // Create arrays to store weights, heights, BMI and status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        // Input weights and heights, calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (m) for person " + (i+1) + ": ");
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
            
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Print BMI and status for each person 
        for(int i=0; i<n; i++) {
            System.out.println("Person " + (i+1) + ": BMI=" + bmi[i] + " Status=" + status[i]);
        }

        // Close the scanner stream
        sc.close();
    }
}