package com.bridgelabz.day11.addressbook;

// 2. Contact Class
public class Contact {
    // Encapsulation: Private fields
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address; // Composition: Contact HAS-A Address

    public Contact(String fName, String lName, String phone, String email, Address address) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phone;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() { 
		return firstName; 
	}
	
    public String getLastName() { 
		return lastName; 
	}
	
    public Address getAddress() { 
		return address; 
	}

    // Setters for editing
    public void setPhoneNumber(String phone) { 
		this.phoneNumber = phone; 
	}
	
    public void setEmail(String email) { 
		this.email = email; 
	}

    @Override
    public String toString() {
        return String.format("Name: %s %s | Phone: %s | Email: %s | Address: %s", firstName, lastName, phoneNumber, email, (address != null ? address : "N/A"));
    }
}