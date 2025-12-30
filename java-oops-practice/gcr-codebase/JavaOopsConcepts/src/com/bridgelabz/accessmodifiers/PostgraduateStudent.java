//Create class PostgraduateStudent that extends Student to demonstrate inheritance and access modifiers.

package com.bridgelabz.accessmodifiers;

public class PostgraduateStudent extends Student {
    // Constructor to initialize PostgraduateStudent by calling parent class constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display Postgraduate Student details
    public void showDetails() {
        
        // Can access public rollNumber and protected name directly
        System.out.println("PG Student: " + name + " (Roll No: " + rollNumber + ")");
        
        // Cannot access private cgpa directly, must use getter
        System.out.println("CGPA: " + getCgpa());
    }

    // Main method to test PostgraduateStudent class
    public static void main(String[] args) {
        
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 3.8);
        
        // Display student details
        pg.showDetails();
        
        // Modify CGPA using public method
        pg.setCgpa(3.9);
        
        // Display updated CGPA
        System.out.println("Updated CGPA: " + pg.getCgpa());
    }
}