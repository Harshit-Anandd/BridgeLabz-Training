package com.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class EventAttendance {

	public static void main(String[] args) {

		List<String> attendees =
				Arrays.asList("John", "Alice", "David");

		attendees.forEach(a ->
		System.out.println("Welcome " + a));
	}
}
