package com.qa.linkedlists;

import java.util.LinkedList;

public class linkedLists {
	
	  public static void main(String[] args) {
	    LinkedList<String> animal = new LinkedList<String>();
	    animal.add("Bird");
	    animal.add("Giraffe");
	    animal.add("Monkey");
	    animal.add("Bull");
	    System.out.println(animal);
	    
	    animal.addFirst("Cat");
	    System.out.println(animal);
	    
	    animal.addLast("Dog");
	    System.out.println(animal);
	    
	    animal.removeFirst();
	    System.out.println(animal);
	    
	    animal.removeLast();
	    System.out.println(animal);
	    
	    System.out.println(animal.getFirst());
	    System.out.println(animal.getLast());
	  }
	}

