package com.bridgelabz.day01.courseenrollmentsystem;

// --- Main Execution ---
public class UniversitySystem {
    public static void main(String[] args) {
        Undergraduate ug = new Undergraduate("Raj", "U1001");
        Postgraduate pg = new Postgraduate("Simran", "P5005");

        // Same score, different GPA calculation (Polymorphism)
        ug.assignGrade(90);
        pg.assignGrade(90);

        ug.printTranscript(); // Expected GPA ~3.6
        pg.printTranscript(); // Expected GPA ~3.15
    }
}