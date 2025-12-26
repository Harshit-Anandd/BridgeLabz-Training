// Create class ResultGenerator that accpets the marks of 5 subjects and calculates the average and grade.

import java.util.Scanner;
public class ResultGenerator {
    public static void main(String[] args) {
		
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Array to hold marks for 5 subjects
        int[] marks = new int[5];
        String[] subjects = {"Maths", "Physics", "Chemistry", "English", "CS"};
        int totalMarks = 0;
        
        System.out.println("--- Raj's Result Processing System ---");
        
        // For-loop to iterate over subjects and take input
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
            marks[i] = sc.nextInt();
            
            // Validate logical marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Treating as 0.");
                marks[i] = 0;
            }
            
            totalMarks += marks[i];
        }
        
        // Calculate Average
        // Formula: $$Average = \frac{Total Marks}{Count}$$
        double average = totalMarks / 5.0;
        
        System.out.println("\n-----------------------------");
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Average Percentage: " + average + "%");
        
        // Switch to assign grades
        // We divide average by 10 to get the 'tens' digit for the switch cases
        // e.g., 85/10 = 8 (Case 8), 92/10 = 9 (Case 9)
        char grade;
        int gradeCategory = (int) average / 10;
        
        switch (gradeCategory) {
            case 10: // For 100%
            case 9:  // 90-99%
                grade = 'A';
                break;
            case 8:  // 80-89%
                grade = 'B';
                break;
            case 7:  // 70-79%
                grade = 'C';
                break;
            case 6:  // 60-69%
                grade = 'D';
                break;
            default: // Below 60%
                grade = (average >= 50) ? 'E' : 'F'; // Minor sub-check
                break;
        }
        
		// Display the result
        System.out.println("Final Grade: " + grade);
        System.out.println("-----------------------------");
		
		// Close the scanner stream
        sc.close();
    }
}