// Create class LuckyDraw that determines winners based on ticket number divisibility

import java.util.Scanner;
public class LuckyDraw {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Diwali Mela Lucky Draw ---");
        System.out.println("Enter ticket number to check if you won!");

        // Loop for ticket checking
        while (true) {
            System.out.println("\n(Type '0' to close the counter.)");
            System.out.print("Enter Ticket Number: ");

            // Check for valid integer input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            int ticketNum = sc.nextInt();

            // Exit condition
            if (ticketNum == 0) {
                break;
            }

            // Determine winner based on divisibility
            if (ticketNum % 3 == 0 && ticketNum % 5 == 0) {
                System.out.println("JACKPOT! Ticket " + ticketNum + " wins a Smart Watch!");
            } else if (ticketNum % 3 == 0) {
                System.out.println("Ticket " + ticketNum + " wins a Chocolate Box .");
            } else if (ticketNum % 5 == 0) {
                System.out.println("Ticket " + ticketNum + " wins a Keychain .");
            } else {
                System.out.println("Better luck next time!");
            }
        }

        System.out.println("Counter Closed.");

        // Close the scanner stream
        sc.close();
    }
}