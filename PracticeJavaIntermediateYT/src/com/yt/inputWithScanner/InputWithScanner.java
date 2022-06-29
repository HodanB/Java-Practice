package com.yt.inputWithScanner;

import java.util.Scanner;

public class InputWithScanner {

	public static void main(String[] args) {
		
//Declaring the object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your first name?");
//		to respond and store info as name
		String name = scan.next();
		
		
		System.out.println("What's your age?");
//		to respond and store info as name
		int age = scan.nextInt();
	
		
		System.out.println("Where are you from?");
//		to respond and store info as name
		String location = scan.next();
		
		

		System.out.println("Whats your favourite quote?");
//		to respond and store info as name
		String quote = scan.next();
		quote += scan.nextLine();
		
		
		
		System.out.println("my name is " + name + " and I'm " + age + " from " + location + "." + " My favourite quote is " + quote + ".");
		
		
	}

}
