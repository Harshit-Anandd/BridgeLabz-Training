package com.lambda.patient;

import java.util.Arrays;
import java.util.List;

public class Patient {
	public static void main(String[] args) {

		List<String> ids =
				Arrays.asList("P101", "P102", "P103");

		// Method reference
		ids.forEach(System.out::println);
	}
}