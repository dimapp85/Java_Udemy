package com.javatrain.inheritance;

public class Tesla extends Car {

	public Tesla(String engine, String fuel, int speed, int countwheels, String enginetype, boolean handsteer,
			double volume,double chargetime,double timeleft) {
		super(engine, fuel, speed, countwheels, enginetype, handsteer, volume);
		// TODO Auto-generated constructor stub
		this.timeleft = 0;
		this.chargetime = 0;
	}


	private double chargetime;
	
	private double timeleft;
	
	
	public void charge(){
	  System.out.println("Charging time is" + chargetime);	
	}
}
