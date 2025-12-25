// Create class TimeZoneDisplay that displays the current time in different time zones around the world

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TimeZoneDisplay {

	// Method to display current time in different time zones
	public void displayTimeZones() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

		// GMT (Greenwich Mean Time)
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("GMT: " + gmtTime.format(formatter));

		// IST (Indian Standard Time)
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("IST: " + istTime.format(formatter));

		// PST (Pacific Standard Time) - Using America/Los_Angeles
		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("PST: " + pstTime.format(formatter));
	}

	public static void main(String[] args) {

		// Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Create the object and call the method
		TimeZoneDisplay tz = new TimeZoneDisplay();
		tz.displayTimeZones();

		// Close the scanner stream
		sc.close();
	}
}