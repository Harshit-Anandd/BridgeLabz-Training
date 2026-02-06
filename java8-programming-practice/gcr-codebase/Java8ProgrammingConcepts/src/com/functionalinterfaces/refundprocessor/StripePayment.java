package com.functionalinterfaces.refundprocessor;
public class StripePayment implements PaymentProcessor {

    public void pay(double amt) {
        System.out.println("Paid using Stripe: " + amt);
    }
}
