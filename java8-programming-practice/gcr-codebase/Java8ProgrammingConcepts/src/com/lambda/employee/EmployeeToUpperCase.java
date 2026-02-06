package com.lambda.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeToUpperCase {

	public static void main(String[] args) {

		List<String> names =
				Arrays.asList("Ravi", "Anita", "John");

		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}