package com.regex.ccvalidation;
import java.util.Scanner;

public class CreditCardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard obj = new CreditCard();

        while (true) {
            System.out.println("\n--- Credit Card Validator ---");
            System.out.println("1. Check Card Number");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) break;

            if (choice == 1) {
                System.out.print("Enter Card Number: ");
                String input = sc.nextLine();
                System.out.println("Result: " + obj.validateCard(input));
            }
        }
        sc.close();
    }
}