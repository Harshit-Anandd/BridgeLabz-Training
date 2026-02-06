package com.lambda.invoice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerator {

	public static void main(String[] args) {

		List<String> ids =
				Arrays.asList("INV101", "INV102");

		List<Invoice> invoices =
				ids.stream()
				.map(Invoice::new) // Constructor reference
				.collect(Collectors.toList());

		invoices.forEach(System.out::println);
	}
}