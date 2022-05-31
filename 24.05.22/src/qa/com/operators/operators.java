package qa.com.operators;

public class operators {
	public static void main(String[] args) {
		double a = 12;
		double b = 15;
		System.out.println("The sume of both value is " + Double.sum(a, b));
		
//	Multiplication - which takes two numbers and returns the product.
		double result = a * b;
		System.out.println("The multiplication of both value is " + (result));
		
//	Subtraction - which takes two numbers, then returns the result of the subtraction.
		double result1 = b - a;
		System.out.println("The subtration of the given values is " +  (result1));
		
//	Division - which takes two numbers, then returns the result of the division.
		double result2 = b / a;
		System.out.println("The division of " + (b) + " with the value " + (a) + " is " + (result2));
		
		
	}


}
