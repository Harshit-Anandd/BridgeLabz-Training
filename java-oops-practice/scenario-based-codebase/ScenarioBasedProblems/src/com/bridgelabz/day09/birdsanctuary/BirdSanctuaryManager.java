package com.bridgelabz.day09.birdsanctuary;
import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
    private List<Bird> birdList = new ArrayList<>();

    public void addBird(Bird bird) {
        birdList.add(bird);
        System.out.println(bird.name + " added to the sanctuary.");
    }

    public void removeBird(String id) {
        boolean removed = birdList.removeIf(b -> b.getId().equalsIgnoreCase(id));
        if (removed) {
            System.out.println("Bird with ID " + id + " removed.");
        } else {
            System.out.println("Bird ID not found.");
        }
    }

    public void displayAllBirds() {
        System.out.println("\n--- All Residents ---");
        if (birdList.isEmpty()) {
			System.out.println("Sanctuary is empty.");
		}
        for (Bird b : birdList) {
            System.out.println(b);
            b.eat();
        }
    }

    // Polymorphism in action: "Is-A" checks
    public void displayFlyables() {
        System.out.println("\n--- Flying Birds ---");
        for (Bird b : birdList) {
            if (b instanceof Flyable) {
                System.out.print(b.name + ": ");
                ((Flyable) b).fly(); // Downcasting
            }
        }
    }

    public void displaySwimmables() {
        System.out.println("\n--- Swimming Birds ---");
        for (Bird b : birdList) {
            if (b instanceof Swimmable) {
                System.out.print(b.name + ": ");
                ((Swimmable) b).swim();
            }
        }
    }

    public void generateReport() {
        int flyers = 0, swimmers = 0, both = 0, neither = 0;

        for (Bird b : birdList) {
            boolean isFly = b instanceof Flyable;
            boolean isSwim = b instanceof Swimmable;

            if (isFly && isSwim) {
				both++;
			} else if (isFly) {
				flyers++;
			} else if (isSwim) {
				swimmers++;
			} else {
				neither++;
			}
        }

        System.out.println("\n--- Sanctuary Statistics ---");
        System.out.println("Total Birds: " + birdList.size());
        System.out.println("Can Fly Only: " + flyers);
        System.out.println("Can Swim Only: " + swimmers);
        System.out.println("Amphibious (Both): " + both);
        System.out.println("Ground Dwellers (Neither): " + neither);
    }
}