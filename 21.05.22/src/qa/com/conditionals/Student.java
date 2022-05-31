package qa.com.conditionals;

public class Student {
public static void main(String[] args) {
		
		int physicsMark = 110;
		int biologyMark = 110;
	    int chemistryMark = 115;
	    int totalPhysicsMarks = 150;
	    int totalBiologyMarks = 150;
	    int totalChemistryMarks = 150;
	    double  maxMarks = totalChemistryMarks + totalBiologyMarks + totalPhysicsMarks;
	        
	    	double totalMarks = biologyMark + chemistryMark + physicsMark;
	    	double percentageResult =roundToTwoDecimalPlaces((totalMarks / maxMarks) * 100);
	    	
	        
	        System.out.println("The student achieved " + physicsMark + " in physics, " + (biologyMark) + " in biology and " + 
	        chemistryMark + " in chemistry. The sum of their total marks is " +  (totalMarks) + ".");
	        System.out.println("Their overall percantage is " + (percentageResult));
	}

	private static double roundToTwoDecimalPlaces(double percentageResult) {
		return Math.floor(percentageResult);
}
}