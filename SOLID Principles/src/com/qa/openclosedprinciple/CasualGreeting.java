package com.qa.openclosedprinciple;

public class CasualGreeting implements Greeting {
	
	@Override
	public String greet() {
		
		return "hey";
	}
}
