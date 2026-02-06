package com.lambda.invoice;

public class Invoice {

	private String id;

	public Invoice(String id) {
		this.id = id;
	}

	public String toString() {
		return "Invoice created: " + id;
	}
}