package qa.com.iteration;

public class IterationFlow {
	 public static void main(String[] args) {
	    	
		int i = 10000;
				
		if(i <= 100) {
			System.out.println("this number is waaaayyy too small!");
			
		} else if(i <= 200) {
			System.out.println("bigger than 100 but smaller than 200");	
				
			} else if(i <= 300) {
				System.out.println("bigger than 200 but smaller than 300");
				
			}else if (i < 1000) {
				System.out.println("bigger than 300 but smaller than 1000");

			}else if (i >= 1000) {
				System.out.println("this number is waaaayyy too big!");;
			} else {
					System.out.println("bigger than expected");
				}
	
	}
}

