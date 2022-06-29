package com.qa.openclosedprinciple;

public class FormalGreeting implements Greeting {
	
	@Override
	public String greet() {
		return "hello";
	}
}
