package qa.com.fizzbuzz;

public class FizzBuzz {
	  public static void main(String[] args) {
    
//method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    int numbers = 30; 
    if (numbers % 3 == 0 && numbers % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (numbers % 3 == 0) {
            System.out.println("Fizz");
        } else if (numbers % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numbers);
        }
    }
}
  

