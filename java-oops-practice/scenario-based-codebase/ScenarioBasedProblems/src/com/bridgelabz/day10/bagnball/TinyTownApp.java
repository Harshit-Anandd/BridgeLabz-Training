package com.bridgelabz.day10.bagnball;

// 4. Main Application
public class TinyTownApp {
    public static void main(String[] args) {
        System.out.println("--- TinyTown Play School Storage ---");

        // Create Bags
        Bag redBag = new Bag("BAG-001", "Red", 3);   // Holds 3 balls
        Bag blueBag = new Bag("BAG-002", "Blue", 2); // Holds 2 balls

        // Create Balls
        Ball b1 = new Ball("B1", "Red", "Small");
        Ball b2 = new Ball("B2", "Green", "Medium");
        Ball b3 = new Ball("B3", "Yellow", "Large");
        Ball b4 = new Ball("B4", "Purple", "Small"); // Extra ball

        // Scenario 1: Filling the Red Bag
        redBag.addBall(b1);
        redBag.addBall(b2);
        redBag.addBall(b3);
        
        // Scenario 2: Exceeding Capacity
        redBag.addBall(b4); // Should fail (Capacity is 3)

        // Scenario 3: Partial Fill of Blue Bag
        blueBag.addBall(b4);

        // Display contents
        redBag.displayContents();
        blueBag.displayContents();

        // Scenario 4: Removing a ball
        redBag.removeBall("B2");
        redBag.displayContents(); // Should now have 2 balls
    }
}