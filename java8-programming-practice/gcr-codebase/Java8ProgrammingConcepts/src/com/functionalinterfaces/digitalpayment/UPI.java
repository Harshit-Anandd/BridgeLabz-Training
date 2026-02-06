package com.functionalinterfaces.digitalpayment;
public class UPI implements Payment {
	public void pay(double amount) {
		System.out.println("Paid via UPI: " + amount);
	}
}
