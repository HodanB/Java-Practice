package com.qa.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 0, 10, 20, 30);
		System.out.println("Original list: " + numbers);
		Integer temp = numbers.get(value1);
		numbers.set(value1, numbers.get(value2));
		numbers.set(value2, temp);
		System.out.println("Swapped list: " + numbers);
		
				
	}

}
