package qa.com;


	// attribute
class Foods {
	// Food attribute
			  protected String type = "I Love";        
	// Food method
			  public void eat() {                    
			    System.out.println("yummmm");
		  }
		}

		class Pizza extends Foods {
// Type of Food attribute
		  private String name = "Veggie Pizza";    
		  public static void main(String[] args) {
 // Create a myPizza object
		    Pizza mypizza = new Pizza();
		    mypizza.eat();

 // Call the Pizza() method (from the Food class) on the mypizza object
		    	mypizza.eat();
		    	
// Display the value of the type attribute (from the Food class) and the value of the name from the Car class
		    System.out.println(mypizza.type + " " + mypizza.name);
		  }
		}
