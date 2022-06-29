package com.yt.hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetsTutorial {
	public static void main(String[] args) {
		
//		HashSet<String> h = new HashSet<String>();
//		h.add("lemur");
//		h.add("orangatang");
//		h.add("spider monkey"); 
//		
//		System.out.println(h.contains("lemur"));
//		
//		System.out.println(h);
//		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(14);
		h.add(24);
		h.add(5);
		
		Iterator<Integer> it = h.iterator();
		
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
	
		
	}

}
