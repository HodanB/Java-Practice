package qa.com.operators;

public class ExamResults {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		int physicsMark = 110;
		int biologyMark = 110;
	    int chemistryMark = 115;
	    int totalPhysicsMarks = 150;
	    int totalBiologyMarks = 150;
	    int totalChemistryMarks = 150;
	    int  maxMarks = 450;
	        
	    	int totalMarks = biologyMark + chemistryMark + physicsMark;
	    	double percentageResult = ((totalMarks / maxMarks) * 100);
	       
	        
	        System.out.println("The student achieved " + physicsMark + " in physics," + (biologyMark) + "in biology and " + 
	        chemistryMark + " in chemistry. The sum of their total marks is " +  (totalMarks) + ".");
	        System.out.println("Their overall percantage is " + (percentageResult));
	}
	}
	