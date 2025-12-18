//Program to calculate total purchase price from unit price and quantity

import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter unit price and quantity
        System.out.println("Enter unit price and quantity : ");

        // Read unit price of item
        double unitPrice = sc.nextDouble();

        // Read quantity of items
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close Scanner Stream
        sc.close();
    }
}