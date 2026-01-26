package com.bridgelabz.day10.bagnball;
import java.util.ArrayList;
import java.util.List;

// 3. Bag Class
public class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    // Composition: A Bag HAS-A list of Balls
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>(); // Initialize the list
    }

    // Method to add a ball (Checking capacity)
    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Added " + ball.getDetails() + " to Bag " + id);
        } else {
            System.out.println("Failed: Bag " + id + " is FULL. Cannot add Ball " + ball.getId());
        }
    }

    // Method to remove a ball by ID
    public void removeBall(String ballId) {
        // Using lambda to find and remove
        boolean removed = balls.removeIf(b -> b.getId().equalsIgnoreCase(ballId));
        
        if (removed) {
            System.out.println("Removed Ball ID: " + ballId + " from Bag " + id);
        } else {
            System.out.println("Ball ID " + ballId + " not found in Bag " + id);
        }
    }

    // Display all balls inside this bag
    public void displayContents() {
        System.out.println("\n--- Contents of Bag " + id + " (" + color + ") ---");
        System.out.println("Capacity: " + balls.size() + "/" + capacity);
        
        if (balls.isEmpty()) {
            System.out.println("(Empty)");
        } else {
            for (Ball b : balls) {
                System.out.println("  -> " + b.getDetails());
            }
        }
    }

    @Override
    public String getDetails() {
        return "Bag [ID: " + id + ", Color: " + color + ", Capacity: " + capacity + "]";
    }
}