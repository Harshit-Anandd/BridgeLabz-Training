package com.streams.display;

import java.util.*;

public class CustomerDisplay {

	public static void main(String[] args) {

		List<String> names =
				Arrays.asList("ravi", "anita", "john");

		names.stream()
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
	}
}
