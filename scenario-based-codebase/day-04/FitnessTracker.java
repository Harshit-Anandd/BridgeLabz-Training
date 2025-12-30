// Create class FitnessTracker that accepts push-up counts for 7 days, calculates the total, active days, and average push-ups per active day.

import java.util.Scanner;
public class FitnessTracker {

	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);

		// Array to store push-up counts for 7 days
		int[] pushUpLog = new int[7];
		String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

		System.out.println("--- Sandeep's Push-up Tracker ---");
		System.out.println("Enter push-ups for each day (Enter 0 for Rest Day):");

		// Input Loop to accept push-ups for each day
		for (int i = 0; i < pushUpLog.length; i++) {
			System.out.print(days[i] + ": ");
			pushUpLog[i] = sc.nextInt();
		}

		int totalPushUps = 0;
		int activeDays = 0;

		System.out.println("\n--- Performance Summary ---");

		// Processing Loop to calculate total and active days
		for (int count : pushUpLog) {

			// Logic: Skip rest days using 'continue'
			if (count == 0) {
				continue;
			}

			totalPushUps += count;
			activeDays++;
		}

		// Calculate average push-ups on active days
		// Avoid division by zero if Sandeep rested all week
		double average = (activeDays > 0) ? (double) totalPushUps / activeDays : 0.0;

		System.out.println("Total Push-ups: " + totalPushUps);
		System.out.println("Active Workout Days: " + activeDays);
		System.out.printf("Average (Active Days): %.1f per day\n", average);

		// Motivation check based on total push-ups
		if (totalPushUps > 100) {
			System.out.println("Great job! Challenge Crushed!");
		} else {
			System.out.println("Keep pushing! Aim for 100 next week.");
		}

		// Close the scanner stream
		sc.close();
	}
}