package com.functionalinterfaces.digitalpayment;
import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment payment;

		System.out.println("1.UPI 2.Wallet");
		int choice = sc.nextInt();

		System.out.print("Amount: ");
		double amt = sc.nextDouble();

		payment = (choice == 1) ? new UPI() : new Wallet();
		payment.pay(amt);
		
		sc.close();
	}
}
