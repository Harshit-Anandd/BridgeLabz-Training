// Create class BMITracker that accepts the values of weight and height from the user and calculates the BMI and BMI Category.

import java.util.Scanner;
public class BMITracker {

    public static void main(String[] args) {
		
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Input height and weight
        System.out.print("Enter height in meters: ");
        double heightInMeters = sc.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = sc.nextDouble();

        // BMI calculation
        double bmi = weightInKg / (heightInMeters * heightInMeters);
		
		// Display the results
        System.out.println("Your BMI is: " + bmi);

        // BMI Category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }
		
		// Close the scanner stream
        sc.close();
    }
}