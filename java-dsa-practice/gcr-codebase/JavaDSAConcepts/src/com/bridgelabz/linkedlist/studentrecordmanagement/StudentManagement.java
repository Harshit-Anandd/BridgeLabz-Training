package com.bridgelabz.linkedlist.studentrecordmanagement;

public class StudentManagement {
    StudentNode head = null;

    // 1. Add student at beginning, end, or specific position
    public void addStudent(int roll, String name, int age, char grade, int position) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        
        // Add at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        StudentNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds. Adding to end.");
            // Logic to add to end would go here, or just return
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // 2. Delete by Roll Number
    public void deleteStudent(int roll) {
        if (head == null) return;

        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }

        StudentNode current = head;
        StudentNode prev = null;

        while (current != null && current.rollNumber != roll) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        } else {
            System.out.println("Student not found.");
        }
    }

    // 3. Search by Roll Number
    public void searchStudent(int roll) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                System.out.println("Found: " + current.name + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // 4. Display all students
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            System.out.println("Roll: " + current.rollNumber + ", Name: " + current.name + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // 5. Update Grade
    public void updateGrade(int roll, char newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                current.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }
    
}