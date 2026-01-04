package com.bridgelabz.day01.courseenrollmentsystem;

//2. Base Class: Student
public class Student {
 protected String name;
 protected String studentID;
 // Private: GPA cannot be edited directly by outside classes
 private double gpa; 

 public Student(String name, String studentID) {
     this.name = name;
     this.studentID = studentID;
     this.gpa = 0.0;
 }

 // Helper Method: Protected setter ensures only subclasses modify GPA
 protected void setGpa(double gpa) {
     if (gpa >= 0.0 && gpa <= 4.0) {
         this.gpa = gpa;
     } else {
         System.out.println("Error: Invalid GPA value.");
     }
 }

 public void printTranscript() {
     System.out.println("Student: " + name + " | GPA: " + gpa);
 }
}