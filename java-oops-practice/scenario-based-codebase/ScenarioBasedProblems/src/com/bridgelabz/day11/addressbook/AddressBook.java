package com.bridgelabz.day11.addressbook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 3. AddressBook Manager Class
public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // Feature: Add Contact with Duplicate Check
    public void addContact(Contact newContact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(newContact.getFirstName()) &&
                c.getLastName().equalsIgnoreCase(newContact.getLastName())) {
                System.out.println("Error: Contact " + newContact.getFirstName() + " already exists.");
                return;
            }
        }
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    // Feature: Edit Contact
    public void editContact(String fName, String lName, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(fName) && c.getLastName().equalsIgnoreCase(lName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Feature: Delete Contact
    public void deleteContact(String fName, String lName) {
        boolean removed = contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(fName) && c.getLastName().equalsIgnoreCase(lName));
        
        if (removed) {
			System.out.println("Contact deleted.");
		} else {
			System.out.println("Contact not found.");
		}
    }

    // Feature: Search by City or State
    public void searchByLocation(String location) {
        System.out.println("\n--- Search Results for: " + location + " ---");
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress() != null && 
               (c.getAddress().getCity().equalsIgnoreCase(location) || 
                c.getAddress().getState().equalsIgnoreCase(location))) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
			System.out.println("No contacts found in this location.");
		}
    }

    // Feature: Display All (Sorted Alphabetically)
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }
        
        // Sorting logic using Comparator
        Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));

        System.out.println("\n--- All Contacts ---");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}