// Create class TotalPriceCalculator that calculates the total price including tax for a given item price

import java.util.Scanner;
public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Take user input for unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        // Take user input for quantity
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print the output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
            
        // Close the scanner stream
        sc.close();
    }
}