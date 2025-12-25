// Create class DateComparison that compares two dates and determines their chronological relationship

import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {

	// Method to compare two dates
	public void compareDates(LocalDate d1, LocalDate d2) {
		if (d1.isBefore(d2)) {
			System.out.println(d1 + " comes before " + d2);
		} else if (d1.isAfter(d2)) {
			System.out.println(d1 + " comes after " + d2);
		} else {
			System.out.println("Both dates are the same.");
		}
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the values
		System.out.print("Enter first date (yyyy-MM-dd): ");
		LocalDate d1 = LocalDate.parse(sc.next());
		System.out.print("Enter second date (yyyy-MM-dd): ");
		LocalDate d2 = LocalDate.parse(sc.next());

		// Create the object and call the method
		DateComparison comp = new DateComparison();
		comp.compareDates(d1, d2);

		// Close the scanner stream
		sc.close();
	}
}