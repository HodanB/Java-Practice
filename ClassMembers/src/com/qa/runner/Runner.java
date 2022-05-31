package com.qa.runner;

import com.qa.customer.*;

public class Runner {

	public static void main(String[] args) {
		
		Customer cust = new Customer();
//		cust.customerInfo();
		
//		System.out.println(cust.age);
		
		System.out.println(cust.getEmail());
		cust.setEmail("test@test.com");
		System.out.println(cust.getEmail());
		
	}
			
	

}
