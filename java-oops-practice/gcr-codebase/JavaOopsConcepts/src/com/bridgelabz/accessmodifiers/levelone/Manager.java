//Create class Manager that extends Employee to demonstrate inheritance and access modifiers.

package com.bridgelabz.accessmodifiers.levelone;

public class Manager extends Employee {
    // Constructor to initialize Manager by calling parent class constructor
    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    // Method to display Manager details using different access levels
    public void showManagerDetails() {
        
        // Display employee ID using public access
        System.out.println("Manager ID: " + employeeID);
        
        // Display department using protected access
        System.out.println("Department: " + department);
        
        // Display salary through public getter method
        System.out.println("Salary: Rs." + getSalary());
    }

    // Main method to test Manager class
    public static void main(String[] args) {
        
        Manager mgr = new Manager(101, "Sales", 75000);
        
        // Display initial manager details
        mgr.showManagerDetails();
        
        // Update salary
        mgr.setSalary(80000);
        
        // Display updated salary
        System.out.println("New Salary: Rs." + mgr.getSalary());
    }
}