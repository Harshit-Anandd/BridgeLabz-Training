// Create class DateFormatting that displays the current date in multiple different formats

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateFormatting {

	// Method to display dates in different formats
	public void displayFormats() {
		LocalDate today = LocalDate.now();

		// Format 1: dd/MM/yyyy
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Format 1: " + today.format(fmt1));

		// Format 2: yyyy-MM-dd
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Format 2: " + today.format(fmt2));

		// Format 3: EEE, MMM dd, yyyy
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("Format 3: " + today.format(fmt3));
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Create the object and call the method
		DateFormatting df = new DateFormatting();
		df.displayFormats();

		// Close the scanner stream
		sc.close();
	}
}