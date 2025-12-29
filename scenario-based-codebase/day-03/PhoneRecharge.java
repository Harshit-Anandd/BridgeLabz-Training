// Create class PhoneRecharge that accepts operator choice and recharge amount, then displays operator-specific offers and updates the balance.

import java.util.Scanner;
public class PhoneRecharge {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Variables to track balance and system status
        double mainBalance = 0.0;
        boolean run = true;
        
        System.out.println("--- Mobile Recharge Hub ---");
        
        // Loop continues until user chooses to exit
        while (run) {
            System.out.println("\nCurrent Balance: Rs. " + mainBalance);
            System.out.println("Select Operator:");
            System.out.println("1. Airtel");
            System.out.println("2. Jio");
            System.out.println("3. Vi");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            
            int operator = sc.nextInt();
            
            // Exit Condition
            if (operator == 4) {
                System.out.println("Exiting...");
                run = false;
                continue; 
            }
            
            // Determine offers based on operator using Switch Expression
            String offerMsg = switch (operator) {
                case 1 -> "Airtel Special: Get 1GB Data on Rs. 100 recharge!";
                case 2 -> "Jio Special: Rs. 50 cashback on Rs. 200 recharge!";
                case 3 -> "Vi Special: Unlimited Night Data on Rs. 150 recharge!";
                default -> "Unknown Operator";
            };
            
            if (offerMsg.equals("Unknown Operator")) {
                System.out.println("Invalid Operator Selected.");
                continue;
            }
            
            System.out.println("Offer: " + offerMsg);
            
            // Recharge Process - Accept amount and update balance
            System.out.print("Enter Amount to Recharge: Rs. ");
            double amount = sc.nextDouble();
            
            // Validate and process recharge
            if (amount > 0) {
                mainBalance += amount;
                System.out.println("Recharge Successful!");
            } else {
                System.out.println("Invalid Amount.");
            }
            
            System.out.println("-------------------------------");
        }
        
        // Close the scanner stream
        sc.close();
    }
}