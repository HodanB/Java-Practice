package com.yt.interfaces;

interface WaterBottleInterface {
	String colour = "Blue";
	void fillUP();
	void pourOut();
	
}

public class interfaces implements WaterBottleInterface {
	public static void main(String[] args) {
		System.out.println(colour);
		
		interfaces ex = new interfaces();
		ex.fillUP();
		ex.pourOut();
	}

	@Override
	public void fillUP() {
		System.out.println("It is filled!");
		
	}

	@Override
	public void pourOut() {
		System.out.println("Water poured out!");
		
		
	}
		
}
