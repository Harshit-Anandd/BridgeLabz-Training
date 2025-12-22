// Create class Scorecard that generates student scores, calculates statistics, and assigns grades.

import java.util.Scanner;
public class Scorecard {

    // Generate random scores for students (3 subjects per student)
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        // Generate random scores between 10 and 99 for each subject
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; // 2-digit score
            }
        }
        
        // Return the scores matrix
        return scores;
    }

    // Calculate statistics (total, average, percentage) for each student
    public static double[][] calculateStats(int[][] scores) {
        // stats[i][0] = total, stats[i][1] = average, stats[i][2] = percentage
        double[][] stats = new double[scores.length][3];
        // Calculate total, average, and percentage for each student
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            stats[i][0] = total;
            stats[i][1] = Math.round((total / 3) * 100.0) / 100.0;
            stats[i][2] = Math.round((total / 300 * 100) * 100.0) / 100.0;
        }
        
        // Return the statistics matrix
        return stats;
    }

    // Get grade based on percentage (A: 80+, B: 70+, C: 60+, D: 50+, E: 40+, R: <40)
    public static String getGrade(double percentage) {
        // Assign grade based on percentage ranges
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        
        // Return Retest for scores below 40
        return "R";
    }

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate scores and calculate statistics
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);

        // Display header and student information
        System.out.println("Std\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n", (i + 1), scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], getGrade(stats[i][2]));
        }
        
        // Close the scanner stream
        sc.close();
    }
}