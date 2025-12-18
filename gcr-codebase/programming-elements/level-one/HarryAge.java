//Creating class with name HarryAge indicating the purpose is to display the Age of Harry

public class HarryAge {
	public static void main (String args[]){
		
		//Create a int variable presentYear and assign value 2024
		int presentYear = 2024;
		
		//Create a int variable yearOfBirth and assign value 2000
		int yearOfBirth = 2000;
		
		//Create a int variable result and calculate the age
		int result = presentYear-yearOfBirth;
		
		// Display the result
		System.out.println("Harry's age in "+ presentYear + " is "  + result);
	}
}