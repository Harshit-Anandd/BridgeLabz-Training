//Create class VotingEligibility that takes age as input and checks if the person is eligible to vote (age 18 or older).

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // Get input for age
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner stream
        sc.close();
    }
}