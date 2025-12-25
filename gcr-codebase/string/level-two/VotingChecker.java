// Create class VotingChecker that generates random ages and checks voter eligibility

public class VotingChecker {

    // Method to generate random ages
    public int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random() * 80) + 10;
        return ages;
    }

    // Method to check voting eligibility
    public String[][] checkEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return results;
    }

    public static void main(String[] args) {
		// Create the object and call the method
        VotingChecker checker = new VotingChecker();
        int[] ages = checker.generateAges(10);
        String[][] eligibility = checker.checkEligibility(ages);

		// Display the result
        System.out.println("Age\tCan Vote");
        for (String[] row : eligibility) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}