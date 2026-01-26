package com.bridgelabz.day11.addressbook;
import java.util.Scanner;

// 4. Main Application
public class DigiContactApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook myBook = new AddressBook();

        // Pre-loading data
        myBook.addContact(new Contact("Alice", "Brown", "9876543210", "alice@mail.com", new Address("New York", "NY", "10001")));
        myBook.addContact(new Contact("Bob", "Smith", "1234567890", "bob@mail.com", new Address("Los Angeles", "CA", "90001")));
        myBook.addContact(new Contact("Charlie", "Davis", "5556667777", "charlie@mail.com", new Address("New York", "NY", "10002")));

        while (true) {
            System.out.println("\n=== Address Book System ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("First Name: "); 
					String fn = sc.nextLine();
                    System.out.print("Last Name: "); 
					String ln = sc.nextLine();
                    System.out.print("Phone: "); 
					String ph = sc.nextLine();
                    System.out.print("Email: "); 
					String em = sc.nextLine();
                    System.out.print("City: "); 
					String city = sc.nextLine();
                    System.out.print("State: "); 
					String state = sc.nextLine();
                    System.out.print("Zip: "); 
					String zip = sc.nextLine();
                    myBook.addContact(new Contact(fn, ln, ph, em, new Address(city, state, zip)));
                    break;
                case 2:
                    System.out.print("Enter First Name of contact to edit: "); 
					String editFn = sc.nextLine();
                    System.out.print("Enter Last Name: "); 
					String editLn = sc.nextLine();
                    System.out.print("New Phone: "); 
					String newPh = sc.nextLine();
                    System.out.print("New Email: "); 
					String newEm = sc.nextLine();
                    myBook.editContact(editFn, editLn, newPh, newEm);
                    break;
                case 3:
                    System.out.print("Enter First Name to delete: "); 
					String delFn = sc.nextLine();
                    System.out.print("Enter Last Name: "); 
					String delLn = sc.nextLine();
                    myBook.deleteContact(delFn, delLn);
                    break;
                case 4:
                    System.out.print("Enter City or State to search: ");
                    myBook.searchByLocation(sc.nextLine());
                    break;
                case 5:
                    myBook.displayAll();
                    break;
                case 6:
                    System.out.println("Exiting DigiContact. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
}