package com.bridgelabz.day04.edumentor;

// 4. Course Hierarchy (Polymorphism)
public class FullDegree extends Course {
    public FullDegree(String name) { super(name); }

    @Override
    public void generateCertificate(String learnerName) {
        System.out.println("Processing Hardcopy Diploma for: " + learnerName);
        System.out.println("Awarded Degree: " + courseName + " (with Honors)");
    }
}