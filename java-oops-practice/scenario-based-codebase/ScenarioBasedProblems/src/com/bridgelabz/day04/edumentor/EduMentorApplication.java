package com.bridgelabz.day04.edumentor;

import java.util.ArrayList;
import java.util.List;

// --- Main Execution ---
public class EduMentorApplication {
    public static void main(String[] args) {
        Learner student = new Learner("Sam", "sam@edu.com", "L-505");
        
        // Quiz Logic
        Quiz javaQuiz = new Quiz(3);
        javaQuiz.addQuestion("Is Java OO?", "yes");
        javaQuiz.addQuestion("Size of int?", "4 bytes");
        
        List<String> attempts = new ArrayList<>();
        attempts.add("yes");
        attempts.add("2 bytes"); // Wrong answer

        double result = javaQuiz.attemptQuiz(attempts);
        System.out.println("Quiz Result: " + result + "%");

        // Polymorphic Certificates
        Certifiable bootCamp = new ShortCourse("Java Basics");
        Certifiable degree = new FullDegree("B.Tech Computer Science");

        bootCamp.generateCertificate(student.name);
        degree.generateCertificate(student.name);
    }
}