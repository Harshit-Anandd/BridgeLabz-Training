// Create class DiscountDashboard that calculates discount based on total bill amount and displays the final payable amount after applying the discount.

import java.util.Scanner;
public class DiscountDashboard {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Shopkeeper's Billing System ---");
        
        System.out.print("How many items in the cart? ");
        int itemCount = sc.nextInt();
        
        // Variable to accumulate total bill
        double totalBill = 0;
        
        // Loop to accept prices for each item and accumulate total
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter price for item " + i + ": Rs. ");
            double price = sc.nextDouble();

            totalBill += price;
        }
        
        System.out.println("\nGross Total: Rs. " + totalBill);
        
        // Discount Logic - Determine discount percentage based on total bill
        // Rate: 20% for > 5000, 10% for > 2000, 0% otherwise
        double discountPercentage;
        if (totalBill > 5000) {
            // 20% discount
            discountPercentage = 0.20; 
        } else if (totalBill > 2000) {
            // 10% discount
            discountPercentage = 0.10; 
        } else {
            // No discount
            discountPercentage = 0.0;  
        }
        
        // Calculate discount amount and final payable amount
        double discountAmount = totalBill * discountPercentage;
        double finalAmount = totalBill - discountAmount;
        
        // Display Final Invoice
        System.out.println("Discount Applied (" + (discountPercentage * 100) + "%): -Rs. " + discountAmount);
        System.out.println("---------------------------");
        System.out.println("NET PAYABLE: Rs. " + finalAmount);
        System.out.println("---------------------------");
        
        // Close the scanner stream
        sc.close();
    }
}