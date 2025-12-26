// Create class CoffeeCounter that accepts the type and quantity of coffee and then calculates the the total GST amd the total bill.

import java.util.Scanner;
public class CoffeeCounter {

    public static void main(String[] args) {
		
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // GST rate stored as variable (no hard coding)
        double gstRate = 0.18;

        // Loop continues until user types "exit"
        while (true) {
			
			// Prompt the user to enter the values
            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
            String coffeeType = sc.nextLine().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café ");
                break;
            }

            double pricePerCup = 0.0;

            // Decide price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 170;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue; // Skip this iteration and restart loop
            }
			
			// Prompt the user to enter the values
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            // Bill calculations
            double baseAmount = pricePerCup * quantity;
            double gstAmount = baseAmount * gstRate;
            double totalBill = baseAmount + gstAmount;

            // Display the results
            System.out.println("Base Amount: Rs." + baseAmount);
            System.out.println("GST (18%): Rs." + gstAmount);
            System.out.println("Total Bill: Rs." + totalBill);
        }
		
		// Close the scanner stream
        sc.close();
    }
}