// Create class TrainReservation that manages the railway reservation system. It accepts user choices to book seats, cancel tickets, or exit the system.

import java.util.Scanner;
public class TrainReservation {

	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user for number of seats
		System.out.println("Enter the total number of seats: ");
		// Initialize with seat capacity 
		int totalCapacity = sc.nextInt();
		int availableSeats = totalCapacity;
		boolean bookingOpen = true;

		System.out.println("--- Railway Reservation System ---");

		// Loop continues until user exits the system
		while (bookingOpen) {

			System.out.println("\nAvailable Seats: " + availableSeats);
			System.out.println("1. Book Ticket");
			System.out.println("2. Cancel Ticket");
			System.out.println("3. Exit System");
			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();

			switch (choice) {

				case 1:

					// Process ticket booking
					if (availableSeats > 0) {
						System.out.print("Enter number of seats to book: ");
						int seatsToBook = sc.nextInt();

						// Check if requested seats are available
						if (seatsToBook <= availableSeats) {
							availableSeats -= seatsToBook;
							System.out.println("Success! " + seatsToBook + " seat(s) booked.");

							// Check if train is full immediately after booking
							if (availableSeats == 0) {
								System.out.println("Alert: Train is now FULL.");
							}
						} else {
							System.out.println("Error: Not enough seats available.");
						}
					} else {
						System.out.println("Sorry, Housefull! No seats left.");
					}
					break;

				case 2:

					// Process ticket cancellation
					// Simple logic: Allow cancellation to increase seats
					// We assume max capacity is 5 for this system
					if (availableSeats < totalCapacity) {
						availableSeats++;
						System.out.println("Ticket Cancelled. Seat restored.");
					} else {
						System.out.println("Error: No bookings to cancel (Train empty).");
					}
					break;

				case 3:

					// Exit the system
					System.out.println("Exiting Reservation System.");
					bookingOpen = false;
					break;

				default:

					System.out.println("Invalid Choice.");
			}
		}

		// Close the scanner stream
		sc.close();
	}
}