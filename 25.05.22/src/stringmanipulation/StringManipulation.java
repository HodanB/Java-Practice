package stringmanipulation;


public class StringManipulation {

	public static void main(String[] args) {
		

//Concatenating Strings
				String str1 = "yesterday it was raining";
				String str2 = "today it is sunny";
				 System.out.println(str1.toUpperCase()+", "+ str2.toUpperCase() + "!");
				 
				 
//Use the substring method to print out: `TODAY IT IS RAINING`

				 String mySubString1 = str2.substring(0, 11);
				 String mySubString2 = str1.substring(16, 24);
				 System.out.println(mySubString1 + mySubString2);
				 
//Count and return how many words there are in that String
				 String myStr = "This is fun";
			        int stringLength = myStr.length();
			        System.out.println("The String Length is " + stringLength); }
			        
//print out this String in a vertical fashion, each word on a different line.
			       
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
			System.out.println(word);
		    }
//print out this String in a vertical fashion in reverse order, each word on a different line

			public void printingVerticalReverse(String message) {
				
				String word = "";
		        for (int i = message.length(); i > 0; i--) {
		        	if (message.substring(i - 1, i).equals(" ")) {
		        		System.out.println(word);
		        		word = "";
		        } else {
		        	word = message.substring(i - 1, i) + word;
		        }
			}
		        System.out.println(word);
				
		            
			}
			    


	}


