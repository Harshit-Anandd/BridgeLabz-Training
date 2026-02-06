package com.streams.foreach;
import java.util.Arrays;
import java.util.List;

public class EmailNotification {

	public static void main(String[] args) {

		List<String> emails =
				Arrays.asList("a@mail.com", "b@mail.com");

		emails.forEach(email ->
		System.out.println(
				"Notification sent to: " + email));
	}
}
