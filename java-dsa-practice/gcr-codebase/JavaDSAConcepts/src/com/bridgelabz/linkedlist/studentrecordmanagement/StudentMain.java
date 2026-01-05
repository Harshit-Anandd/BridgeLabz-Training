package com.bridgelabz.linkedlist.studentrecordmanagement;

public class StudentMain {

	public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addStudent(101, "Alice", 20, 'A', 1);
        sm.addStudent(102, "Bob", 21, 'B', 2);
        sm.addStudent(103, "Charlie", 22, 'C', 3);

        System.out.println("All Students:");
        sm.display();

        System.out.println("\nUpdating Alice's Grade:");
        sm.updateGrade(101, 'O');
        sm.searchStudent(101);

        System.out.println("\nDeleting Bob:");
        sm.deleteStudent(102);
        sm.display();
    }
	
}