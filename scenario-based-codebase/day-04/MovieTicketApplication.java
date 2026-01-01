// Create class MovieTicketApplication that calculates ticket prices based on format and seat type

import java.util.Scanner;
public class MovieTicketApplication {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        boolean counterOpen = true;

        System.out.println("--- Blockbuster Ticket System ---");

        // Loop for multiple customers
        while (counterOpen) {
            System.out.println("\n--- New Customer ---");
            System.out.println("Select Movie Type:");
            System.out.println("1. Standard (2D)");
            System.out.println("2. 3D Experience");
            System.out.println("3. IMAX");
            System.out.println("4. Close Counter");
            System.out.print("Enter Choice: ");

            int movieChoice = sc.nextInt();

            // Check if user wants to close counter
            if (movieChoice == 4) {
                System.out.println("Closing counter. Goodbye!");
                counterOpen = false;
                continue;
            }

            // Determine movie type and base price
            int ticketPrice = 0;
            String movieType = "";

            switch (movieChoice) {
                case 1:
                    ticketPrice = 150;
                    movieType = "Standard 2D";
                    break;
                case 2:
                    ticketPrice = 250;
                    movieType = "3D Experience";
                    break;
                case 3:
                    ticketPrice = 400;
                    movieType = "IMAX";
                    break;
                default:
                    System.out.println("Invalid Movie Type.");
                    continue;
            }

            // Seat selection logic
            System.out.print("Select Seat (G for Gold +Rs.50 / S for Silver): ");
            char seatType = sc.next().toUpperCase().charAt(0);

            if (seatType == 'G') {
                ticketPrice += 50;
                System.out.println("Gold Seat Selected.");
            } else if (seatType == 'S') {
                System.out.println("Silver Seat Selected.");
            } else {
                System.out.println("Invalid input. Defaulting to Silver.");
            }

            // Snacks selection logic
            System.out.print("Add Popcorn Combo for Rs. 150? (yes/no): ");
            String snackChoice = sc.next();
            int snackCost = 0;

            if (snackChoice.equalsIgnoreCase("yes")) {
                snackCost = 150;
            }

            // Calculate total bill
            int totalBill = ticketPrice + snackCost;

            // Display ticket summary
            System.out.println("\n--- Ticket Summary ---");
            System.out.println("Movie: " + movieType);
            System.out.println("Seat Charge: Rs. " + ticketPrice);
            System.out.println("Snacks: Rs. " + snackCost);
            System.out.println("TOTAL TO PAY: Rs. " + totalBill);
            System.out.println("----------------------");
        }

        // Close the scanner stream
        sc.close();
    }
}