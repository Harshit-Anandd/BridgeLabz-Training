// Create class DateArithmetic that performs various date arithmetic operations like adding/subtracting days, months, and years

import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {

	// Method to perform date operations
	public void performDateOperations(String dateStr) {
		LocalDate date = LocalDate.parse(dateStr);

		// Display original date
		System.out.println("Original Date: " + date);

		// Add 7 days, 1 month, 2 years
		LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("After Adding (7 days, 1 month, 2 years): " + addedDate);

		// Subtract 3 weeks
		LocalDate finalDate = addedDate.minusWeeks(3);
		System.out.println("After Subtracting 3 weeks: " + finalDate);
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter date (yyyy-MM-dd): ");
		String dateInput = sc.next();

		// Create the object and call the method
		DateArithmetic calc = new DateArithmetic();
		calc.performDateOperations(dateInput);

		// Close the scanner stream
		sc.close();
	}
}