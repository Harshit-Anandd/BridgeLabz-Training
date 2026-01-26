package com.bridgelabz.day10.geomeasure;

// 2. Line Class (Encapsulated Data)
public class Line {
    private Point start;
    private Point end;
    private double length;

    // Constructor using 'this' to assign fields
    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
        this.calculateLength(); // Internal calculation
    }

    // Method to calculate length using Distance Formula
    private void calculateLength() {
        // d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        this.length = Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    // Getter for length (Read-only access)
    public double getLength() {
        return this.length;
    }

    // Comparison Logic
    public void compareTo(Line otherLine) {
        if (this.length == otherLine.length) {
            System.out.println("Result: Both lines are Equal in length.");
        } else if (this.length > otherLine.length) {
            System.out.println("Result: Line 1 is Longer.");
        } else {
            System.out.println("Result: Line 2 is Longer.");
        }
    }
}