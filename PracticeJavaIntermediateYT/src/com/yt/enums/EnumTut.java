package com.yt.enums;

public class EnumTut {
	enum Flavour{
		CHOCOLATE, VANILLA, STRAWBERRY
	}

	public static void main(String[] args) {
		Flavour flav = Flavour.VANILLA; 
		
		if(flav == flav.VANILLA) {
			System.out.println("it's vanilla");
		} else if(flav ==flav.CHOCOLATE) {
			System.out.println("it's chocolate");
		} else if(flav ==flav.STRAWBERRY) {
			System.out.println("it's strawberry");
		}

	}

}
