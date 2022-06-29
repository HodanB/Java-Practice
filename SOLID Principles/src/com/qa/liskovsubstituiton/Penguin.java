package com.qa.liskovsubstituiton;

public class Penguin extends FlightlessBird {

	@Override
	public void flap() {
		// TODO Auto-generated method stub
		
	}
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
