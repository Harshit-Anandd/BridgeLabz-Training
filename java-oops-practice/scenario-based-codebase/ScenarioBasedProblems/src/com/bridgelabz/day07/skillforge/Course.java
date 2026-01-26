package com.bridgelabz.day07.skillforge;
import java.util.ArrayList;
import java.util.List;

// 4. Course Class
public class Course implements ICertifiable {
    private String title;
    private Instructor instructor;
    private List<String> modules;
    // Encapsulation: Rating is private, modified only via specific logic
    private double rating; 
    private int reviewCount;
    private String level; // "Beginner" or "Advanced"

    // Constructor 1: Default Modules
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new ArrayList<>();
        this.modules.add("Introduction");
        this.modules.add("Core Concepts");
        this.modules.add("Final Assessment");
        this.rating = 0.0;
    }

    // Constructor 2: Custom Modules (Overloading)
    public Course(String title, Instructor instructor, String level, List<String> customModules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = customModules;
        this.rating = 0.0;
    }

    // Encapsulated Logic: Update Rating
    public void submitReview(int stars) {
        if (stars >= 1 && stars <= 5) {
            // Moving average formula
            rating = ((rating * reviewCount) + stars) / (reviewCount + 1);
            reviewCount++;
            System.out.println("Review submitted. New Rating: " + String.format("%.1f", rating));
        } else {
            System.out.println("Invalid Rating (1-5 only).");
        }
    }

    public void completeCourse(Student student, double score) {
        // Operator: Grading Logic
        if (score >= 60) {
            System.out.println("\n " + student.getName() + " passed " + title + " (Score: " + score + "%)");
            generateCertificate(student.getName());
        } else {
            System.out.println("\n " + student.getName() + " failed " + title + ". Please retake modules.");
        }
    }

    @Override
    public void generateCertificate(String studentName) {
        // Polymorphism: Certificate format varies by Level
        System.out.println("------------------------------------------------");
        if (level.equalsIgnoreCase("Advanced")) {
            System.out.println("|  GOLD SEAL CERTIFICATE OF MASTERY        |");
            System.out.printf("| Awarded to: %-32s |\n", studentName);
            System.out.printf("| For Advanced Proficiency in: %-16s |\n", title);
        } else {
            System.out.println("|  CERTIFICATE OF COMPLETION               |");
            System.out.printf("| Presented to: %-30s |\n", studentName);
            System.out.printf("| For completing: %-28s |\n", title);
        }
        System.out.printf("| Instructor: %-32s |\n", instructor.getName());
        System.out.println("------------------------------------------------");
    }
}
