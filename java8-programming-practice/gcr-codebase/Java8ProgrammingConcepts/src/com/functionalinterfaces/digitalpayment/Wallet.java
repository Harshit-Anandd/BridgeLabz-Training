package com.functionalinterfaces.digitalpayment;
public class Wallet implements Payment {
	public void pay(double amount) {
		System.out.println("Paid via Wallet: " + amount);
	}
}
