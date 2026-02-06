package com.lambda.alerts;
import java.util.*;
import java.util.function.Predicate;

public class AlertFilter {

	public static void main(String[] args) {
		List<Alert> alerts = Arrays.asList(
				new Alert("Emergency"),
				new Alert("Reminder"),
				new Alert("Billing")
				);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alert type to display: ");
		String pref = sc.nextLine();

		Predicate<Alert> filter =
				a -> a.getType().equalsIgnoreCase(pref);

				alerts.stream()
				.filter(filter)
				.forEach(System.out::println);
				
				sc.close();
	}
}