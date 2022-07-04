package com.qa.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Brands {
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
// store Brand name in our HashSet before printing it out
		hashSet.add("Gucci");
		hashSet.add("Chanel");
		hashSet.add("OFF-WHITE");
		
		System.out.println(hashSet);
	
//	TO check whether a HashSet is empty or not by using isEmpty()
//	! is the not value by inverting the result of a comparison
		
		System.out.println(!hashSet.isEmpty());
	}
}


