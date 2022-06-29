package com.yt.hashmaps;

import java.util.HashMap;

public class Hashing {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
//		int c = 88;
//		
//		HashMap<String, Integer> happy = new HashMap<String, Integer>();
//		
//		happy.put("a", 10);
//		happy.put("b", 3);
//		happy.put("c", 88);
//		
//		System.out.println(happy.get("c"));
		
		HashMap<String,String> fun = new HashMap<String,String>();
		fun.put("notjackharlow123", "password");
		fun.put("justinbeiber", "password123");
		
		System.out.println(fun.replace("notjackharlow123", "betterpassword"));
		System.out.println(fun);
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		
		
	}
}
