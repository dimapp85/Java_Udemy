package com.javatrain.inheritance;

public  class Car extends Vehicle {

	public Car(String engine, String fuel, int speed,int countwheels,String enginetype,boolean handsteer,double volume) {
		super("Car", engine, fuel, speed);
		this.countwheels = countwheels;
		this.enginetype = enginetype;
		this.handsteer = handsteer;
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}


	private int countwheels;
	
	
    private String enginetype;
	
	private boolean handsteer;
	
	private double volume;
	
    private int gear;
	
	
	public void move(int speed){
		System.out.println("Move  of Car called"+ speed);
	}
	
	public void turnLeft(){
		System.out.println("Turn left");
	}
	
	public void turnRight(){
		System.out.println("Turn right");
	}
	
	
	public void changegear(boolean flag){
		if(flag==true){
			this.gear++;
		}
		else {
			this.gear--;
		}
		System.out.println("Gear is"+ gear);
	}
	
}
