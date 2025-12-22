//Create class SimpleInterest that contains method to calculate simple interest

import java.util.Scanner;
public class SimpleInterest {

	// Method to calculate simple interest
    // Takes principal, rate, and time as parameters and returns the interest
    public double calculateSimpleInterest(double principal, double time, double rate) {

        // Formula: Simple Interest = Principal * Rate * Time / 100
        double simpleInterest = (principal * rate * time) / 100;

		// Returning the calculated simple interest
        return simpleInterest;
    }

	public static void main (String args[]) {

		// Scanner class to take input from user
		Scanner sc = new Scanner (System.in);

		// Prompting user to enter principal amount, time and rate of interest
		System.out.println("Enter the principal amount, time in years and rate of interest:");
		
		// Taking principal amount, time and rate of interest as input
		double principal = sc.nextDouble();
		double time = sc.nextDouble();
		double rate = sc.nextDouble();

		// Creating object of SimpleInterest class to call method
		SimpleInterest obj = new SimpleInterest();

		// Calling method to calculate simple interest
		double interest = obj.calculateSimpleInterest(principal, time, rate);
		// Displaying the simple interest
		System.out.println ("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

		// Close the scanner object
		sc.close();		
	}
}