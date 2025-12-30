//Create class Student to demonstrate access modifiers with attributes and getters/setters.

package com.bridgelabz.accessmodifiers;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor to initialize Student attributes
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter method to retrieve CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Setter method to update CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}