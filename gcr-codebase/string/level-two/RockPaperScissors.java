// Create class RockPaperScissors that contains methods to play Rock/Paper/Scissors with the user

import java.util.Scanner;
public class RockPaperScissors {
	
	// Method to get the choice of the computer
    public String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        if (rand == 0) {
			return "Rock";
		} if (rand == 1) {
			return "Paper"; 
		}
        return "Scissors";
    }
	
	//  Method to get the winner based on the choices made
    public String getWinner(String user, String comp) {
        if (user.equalsIgnoreCase(comp)) {
			return "Draw";
		} if ((user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) || (user.equalsIgnoreCase("Scissors") && comp.equals("Paper")) || (user.equalsIgnoreCase("Paper") && comp.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
		
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the values
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
		
		// Create the object for calling the method
        RockPaperScissors game = new RockPaperScissors();
		
		// Create variables to maintain the scorecard
        int userWins = 0, compWins = 0;
		
		// Use loops for input and processing the result
        for (int i = 0; i < n; i++) {
			
			// Prompt the user to enter the values
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = sc.next();
			
			// Calling the methods
            String comp = game.getComputerChoice();
            String winner = game.getWinner(user, comp);
			
			// Display the result
            System.out.println("Comp: " + comp + " | Winner: " + winner);
			
			// Updating the score
            if (winner.equals("User")) {
				userWins++;
			} else if (winner.equals("Computer")) {
				compWins++;
			}
        }
		
		// Display the scorecard and final stats
        System.out.println("\nStats:");
        System.out.println("User Wins: " + userWins + " (" + (userWins * 100.0 / n) + "%)");
        System.out.println("Comp Wins: " + compWins + " (" + (compWins * 100.0 / n) + "%)");
		
		// Close the scanner stream
        sc.close();
    }
}