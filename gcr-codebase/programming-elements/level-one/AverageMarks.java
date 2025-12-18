//Create class AverageMarks to compute the average marks scored by Sam in PCM

public class AverageMarks {
	public static void main (String args []) {
		
		//Create a int variable maths and assign value 94
		int maths = 94;
		
		//Create a int variable physics and assign value 95
		int physics = 95;
		
		//Create a int variable chemistry and assign value 96
		int chemistry = 96;
		
		//Create a double variable average and compute the value
		double average = (physics+chemistry+maths) / 3 ;
		
		//Display the average
		System.out.println ("The average marks scored = " + average);
	}
}