//Create class Employee to demonstrate access modifiers with salary management.

package com.bridgelabz.accessmodifiers.levelone;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize Employee attributes
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Setter method to update salary with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Getter method to retrieve salary
    public double getSalary() {
        return salary;
    }
}