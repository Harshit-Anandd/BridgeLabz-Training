package com.bridgelabz.day03.campusconnect;

// --- Main Execution ---
public class CampusConnectApplication {
    public static void main(String[] args) {
        Faculty profSharma = new Faculty("Dr. Sharma", "sharma@uni.edu", "FAC-01", "Computer Science");
        Student raman = new Student("Raman", "raman@uni.edu", "STU-101");
        Student priya = new Student("Priya", "priya@uni.edu", "STU-102");

        // Create Course and Assign
        Course javaCourse = new Course("Core Java", profSharma);
        javaCourse.addStudent(raman);
        javaCourse.addStudent(priya);

        // Grade Processing
        profSharma.assignGrade(raman, 8.5);
        profSharma.assignGrade(raman, 9.0); // 2nd subject/assignment
        profSharma.assignGrade(priya, 9.5);

        // Polymorphism in action
        profSharma.printDetails();
        raman.printDetails(); 
    }
}