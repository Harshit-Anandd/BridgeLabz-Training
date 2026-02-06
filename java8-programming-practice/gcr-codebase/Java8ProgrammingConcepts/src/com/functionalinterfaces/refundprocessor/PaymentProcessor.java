package com.functionalinterfaces.refundprocessor;
public interface PaymentProcessor {

	void pay(double amt);

	default void refund(double amt) {
		System.out.println("Refund processed: " + amt);
	}
}
