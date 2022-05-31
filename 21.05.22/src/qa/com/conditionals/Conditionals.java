package qa.com.conditionals;

public class Conditionals {

    public static void main(String[] args) {
    	
//Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message
//if the person gets higher than 60% overall, if they fail 1 or more of the exams
    	 int biology = 100;
    	 int chemistry = 70;
    	 int physics = 54;

         if(biology <= 60) {
             System.out.println("the person did not achieve more than 60% in biology.");
         } else if(chemistry <= 60) {
        	 System.out.println("the person did not achieve more than 60% in chemistry but passed biology."); 
         } else if(physics <= 60) {
	        	 System.out.println("the person did not achieve more than 60% in their physics exam but passed the rest.");
         } else {
        	  System.out.println("the person did achieve more than 60%.");
         }
//Given 2 integer values greater than 0, return whichever is closest to 21 
         int number = 10;
         int number2 = 21;

         if(number > 0 & number2 == 21) {
             System.out.println("Number is greater than to 0 and Number 2 is equal to 21");
         } else {
             System.out.println("Number is less than 10, or Number 2 is not equal to 20");
         }
         
    }
}

       
     
    
