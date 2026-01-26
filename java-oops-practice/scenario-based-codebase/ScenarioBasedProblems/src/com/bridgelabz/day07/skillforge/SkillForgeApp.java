package com.bridgelabz.day07.skillforge;
import java.util.ArrayList;
import java.util.List;

// --- Main Execution ---
public class SkillForgeApp {
    public static void main(String[] args) {
        // Create Users
        Instructor profDave = new Instructor("Dave Wilson", "dave@skillforge.com", "INS-001");
        Student alice = new Student("Alice Green", "alice@web.com", "STU-102");
        Student bob = new Student("Bob Brown", "bob@web.com", "STU-103");

        // Create Courses
        Course javaBasics = new Course("Java Fundamentals", profDave, "Beginner");
        
        List<String> advModules = new ArrayList<>();
        advModules.add("Multithreading");
        advModules.add("JDBC");
        Course advJava = new Course("Advanced Java", profDave, "Advanced", advModules);

        // Course Interaction
        javaBasics.completeCourse(alice, 85.0); // Pass -> Standard Cert
        
        System.out.println();
        
        advJava.completeCourse(bob, 92.5); // Pass -> Gold Cert

        // Rating System
        System.out.println("\n--- Rating System ---");
        advJava.submitReview(5);
        advJava.submitReview(4);
    }
}