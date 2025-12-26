// Create class MetroSmartCard thats accepts the distance as input and deducts the calculated fare from the smart card balance.

import java.util.Scanner;
public class MetroSmartCard {
    public static void main(String[] args) {
		
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Initial setup
        System.out.print("Enter Initial Smart Card Balance: Rs. ");
        double balance = sc.nextDouble();
        
        String choice;
        
		// Loop continues until the balance gets exhausted
        do {
            System.out.println("\n--- New Journey ---");
            System.out.print("Enter distance traveled (km): ");
            double distance = sc.nextDouble();
            
            // Logic: Calculate Fare using Ternary Operator
            // Rate: Rs 10 for < 5km, Rs 20 for 5-15km, Rs 40 for > 15km
            double fare = (distance < 5) ? 10 : (distance <= 15 ? 20 : 40);
            
            System.out.println("Calculated Fare: Rs. " + fare);
            
            // Check Balance
            if (balance >= fare) {
                balance -= fare; // Deduct fare
                System.out.println("Success! Remaining Balance: Rs. " + balance);
            } else {
                System.out.println("Insufficient Balance! Please recharge.");
                // We do not break here; user might want to recharge or quit, 
                // but for this logic, we assume they can't travel this trip.
            }
            
            // Check if user wants to continue or if balance is effectively zero
            if (balance <= 0) {
                System.out.println("Balance exhausted. Exiting.");
                break;
            }

            System.out.print("Do you want to take another trip? (yes/no): ");
            choice = sc.next();
            
        } while (!choice.equalsIgnoreCase("no"));
        
		// Display the result
        System.out.println("Exiting Metro System. Final Balance: Rs. " + balance);
		
		// Close the scanner stream
        sc.close();
    }
}