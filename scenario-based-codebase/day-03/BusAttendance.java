// Create class BusAttendance that tracks student attendance for a school bus and generates an attendance report.

import java.util.Scanner;
public class BusAttendance {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Array of 10 students
        String[] students = {"Aarav", "Bianca", "Charlie", "Dhruv", "Esha", "Fing", "George", "Harshit", "Ishan", "Jayash"};
        
        // Variables to track attendance
        int presentCount = 0;
        int absentCount = 0;
        
        System.out.println("--- School Bus Attendance ---");
        System.out.println("Type 'p' for Present, 'a' for Absent.");
        
        // For-each loop to iterate over students and mark attendance
        for (String student : students) {
            System.out.print("Is " + student + " present? ");
            char status = sc.next().toLowerCase().charAt(0);
            
            // Record attendance status
            if (status == 'p') {
                presentCount++;
            } else if (status == 'a') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Marking as Absent by default.");
                absentCount++;
            }
        }
        
        // Display Attendance Report
        System.out.println("\n--- Attendance Report ---");
        System.out.println("Total Students: " + students.length);
        System.out.println("Present: " + presentCount);
        System.out.println("Absent:  " + absentCount);
        
        // Close the scanner stream
        sc.close();
    }
}