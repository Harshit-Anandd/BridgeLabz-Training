// Create class CurrencyConverter that converts INR to different currencies

import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        String choice;

        // Exchange Rates
        final double USD_RATE = 83.50;
        final double EUR_RATE = 90.25;
        final double GBP_RATE = 105.50;

        System.out.println("--- Currency Exchange Kiosk ---");

        // Loop for multiple transactions
        do {
            System.out.print("\nEnter Amount in INR (Rs.): ");
            double inrAmount = sc.nextDouble();

            System.out.println("Select Target Currency:");
            System.out.println("1. USD (Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. GBP (Pound Sterling)");
            System.out.print("Enter code (1-3): ");
            int currencyType = sc.nextInt();

            // Variables for conversion
            double convertedAmt = 0;
            String symbol = "";

            // Switch to determine currency and convert
            switch (currencyType) {
                case 1:
                    convertedAmt = inrAmount / USD_RATE;
                    symbol = "USD";
                    break;
                case 2:
                    convertedAmt = inrAmount / EUR_RATE;
                    symbol = "EUR";
                    break;
                case 3:
                    convertedAmt = inrAmount / GBP_RATE;
                    symbol = "GBP";
                    break;
                default:
                    System.out.println("Invalid Selection.");
                    // Skip printing result if invalid
                    convertedAmt = -1;
            }

            // Display conversion result
            if (convertedAmt != -1) {
                System.out.printf("You receive: %.2f %s\n", convertedAmt, symbol);
            }

            // Ask to continue
            System.out.print("Convert another amount? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for visiting!");

        // Close the scanner stream
        sc.close();
    }
}