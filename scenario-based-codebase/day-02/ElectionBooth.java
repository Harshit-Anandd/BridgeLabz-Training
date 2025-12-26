// Create class ElectionBooth that accepts the age of a candidate as an input and then checks the eligibility to vote. Also shows the final vote count.

import java.util.Scanner;
public class ElectionBooth {
    public static void main(String[] args) {
		
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Variables to track votes
        int votesCandidate1 = 0;
        int votesCandidate2 = 0;
        int votesCandidate3 = 0;
        
        System.out.println("--- Election Booth System Initialized ---");
        System.out.println("Type '-1' as age to stop voting and close booth.");
		
		// Loop continues until user types "-1"
        while (true) {
            System.out.print("\nEnter Voter Age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear buffer
                continue;
            }
            int age = sc.nextInt();

            // Exit Condition
            if (age == -1) {
                break;
            }

            // Eligibility Check
            if (age >= 18) {
                System.out.println("Voter Eligible. Please cast your vote.");
                System.out.println("1. Party A | 2. Party B | 3. Party C");
                System.out.print("Enter Choice (1-3): ");
                
                int vote = sc.nextInt();
                
                // Record Vote
                if (vote == 1) {
                    votesCandidate1++;
                    System.out.println("Vote Cast for Party A.");
                } else if (vote == 2) {
                    votesCandidate2++;
                    System.out.println("Vote Cast for Party B.");
                } else if (vote == 3) {
                    votesCandidate3++;
                    System.out.println("Vote Cast for Party C.");
                } else {
                    System.out.println("Invalid Ballot. Vote discarded.");
                }
            } else {
                System.out.println("Underage. Not eligible to vote.");
            }
        }

        // Final Report
        System.out.println("\n--- Final Vote Count ---");
        System.out.println("Party A: " + votesCandidate1);
        System.out.println("Party B: " + votesCandidate2);
        System.out.println("Party C: " + votesCandidate3);
        
		// Close the scanner stream
        sc.close();
    }
}