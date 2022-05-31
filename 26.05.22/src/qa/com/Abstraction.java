package qa.com;
//Abstract class: is a restricted class that cannot be used to create objects 
//(to access it, it must be inherited from another class)

//Abstract class
	abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();
// Regular method
	public void sleep() {
 System.out.println("Zzz");
}
}
//Subclass (inherit from Animal)
		class Pig extends Animal {
		public void animalSound() {
			
 // The body of animalSound() is provided here
 System.out.println("The pig says: is that a chciken?");
}
}

	class Abstraction {
	 public static void main(String[] args) {
		    Pig myPig = new Pig(); // Create a Pig object
		    myPig.animalSound();
		    myPig.sleep();
		  }
		}
	




