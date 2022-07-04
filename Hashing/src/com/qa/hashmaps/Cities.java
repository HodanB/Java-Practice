package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Cities {
	public static void main(String[] args) {
		Map<String, String> capitalCities = new HashMap<>();
		
	     capitalCities.put("England", "London");
	     capitalCities.put("Russia","Moscow");
	     capitalCities.put("Japan","Tokyo");

	  System.out.println(capitalCities.get("Japan"));
		}
	}
		


