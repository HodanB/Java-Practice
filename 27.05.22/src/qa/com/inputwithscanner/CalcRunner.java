package qa.com.inputwithscanner;

import java.util.Scanner;

public class CalcRunner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
        Double number1 = scan.nextDouble();    
        
        System.out.println("Please enter a number: ");
        Double number2 = scan.nextDouble();
        
        System.out.println("Choose an operator: Addition, Subtraction, Multiplication, or Division");
        String operator = scan.nextLine();
        
        case "Addition":
        	System.out.println("The solution is " + calc.add(number1 + number2)); 
        	

        
        System.out.println("Subtraction:"  + (number1 - number2)); 
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
		
	}
}
        
        
//System.out.println("Choose an operator: +, -, *, or /");
//char operator = scan.next().charAt(0);

 
//        
//        If (char:'+') {
//        	System.out.println (Integer.sum(number1, number1));
//        } else if ('-') {
//            System.out.println(number1 - number2);
//        } else if ('*') {
//            System.out.println(number1 * number2);
//        }   else ('/') {
//                System.out.println(number1 / number2);
//        }
//	
//
//	}
//
//}

	