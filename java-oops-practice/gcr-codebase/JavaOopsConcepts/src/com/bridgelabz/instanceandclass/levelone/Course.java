//Create class Course to demonstrate instance and class variables, and methods.

package com.bridgelabz.instanceandclass.levelone;

public class Course {

    // Instance variables to store course information
    private String courseName;
    private int duration;
    private double fee;

    // Class variable - shared by all course instances
    private static String instituteName = "Tech Institute";

    // Constructor to initialize course with name, duration and fee
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + ", Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee);
    }

    // Class method to update institute name for all courses
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test Course class
    public static void main(String[] args) {

        // Create first course instance
        Course c1 = new Course("Java Basics", 4, 200);

        // Create second course instance
        Course c2 = new Course("Advanced Java", 6, 300);

        // Display course details
        c1.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("Code Academy");
        System.out.println("\nAfter Institute Name Update:");

        // Display course details after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}