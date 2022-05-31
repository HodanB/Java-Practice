package qa.com.stringmanipulation;

public class StringVertical {
	
	       
		public void printingVerticalLine(String message) {
		        
			String word = "";
		        
			for (int i = 0; i < message.length(); i++) {
		            
				if (message.substring(i, i + 1).equals(" ")) {
		                System.out.println(word);
		                word = "";
		            
				} else {
		                word += message.substring(i, i+1);
		            }
		        }
		}
}
		     
	


