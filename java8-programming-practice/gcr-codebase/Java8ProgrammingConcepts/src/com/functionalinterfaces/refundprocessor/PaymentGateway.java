package com.functionalinterfaces.refundprocessor;
public class PaymentGateway {

	public static void main(String[] args) {

		PaymentProcessor p = new StripePayment();
		p.pay(1000);
		p.refund(200);
	}
}