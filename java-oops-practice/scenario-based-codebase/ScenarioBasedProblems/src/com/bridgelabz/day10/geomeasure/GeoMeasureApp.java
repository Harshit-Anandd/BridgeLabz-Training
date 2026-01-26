package com.bridgelabz.day10.geomeasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 3. Main Application
public class GeoMeasureApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Line[]> history = new ArrayList<>(); // Bonus: Store comparisons

        System.out.println("--- GeoMeasure Solutions ---");

        while (true) {
            System.out.println("\nEnter Coordinates for Line 1:");
            Line line1 = createLine(sc);

            System.out.println("Enter Coordinates for Line 2:");
            Line line2 = createLine(sc);

            System.out.printf("Length L1: %.2f | Length L2: %.2f\n", line1.getLength(), line2.getLength());
            line1.compareTo(line2);

            // Bonus: Store history
            history.add(new Line[]{line1, line2});

            System.out.print("Compare another pair? (yes/no): ");
            if (sc.next().equalsIgnoreCase("no")) break;
        }
        
        System.out.println("Exiting GeoMeasure. Total Comparisons: " + history.size());
        sc.close();
    }

    // Helper method to keep main clean
    private static Line createLine(Scanner sc) {
        System.out.print("x1: "); double x1 = sc.nextDouble();
        System.out.print("y1: "); double y1 = sc.nextDouble();
        System.out.print("x2: "); double x2 = sc.nextDouble();
        System.out.print("y2: "); double y2 = sc.nextDouble();
        return new Line(x1, y1, x2, y2);
    }
}