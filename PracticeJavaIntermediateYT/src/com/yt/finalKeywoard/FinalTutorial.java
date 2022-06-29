package com.yt.finalKeywoard;

public class FinalTutorial {
	

	final int MAX = 5;

//The final field FinalTutorial.MAX cannot be assigned			
//	void changeMAX(int newMAX) {
//		MAX = newMAX;
//	}
	
	public static void main(String[] args) {
	FinalTutorial f = new FinalTutorial();
		System.out.println(f.MAX);
	}
}
