package com.yt.hashmaps;

import java.util.HashMap;

public class Hashing {
	public static void main(String[] args) {

		HashMap<String,String> fun = new HashMap<String,String>();
		fun.put("notjackharlow123", "password");
		fun.put("justinbeiber", "password123");
		
		System.out.println(fun.replace("notjackharlow123", "betterpassword"));
		System.out.println(fun);
		System.out.println(fun.keySet());
		System.out.println(fun.values());
		
		
	}
}
