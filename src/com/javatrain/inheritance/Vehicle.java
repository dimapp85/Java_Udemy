package com.javatrain.inheritance;

public class Vehicle {

	private String type;
	
	private String engine;
	
	private String fuel;
	
	private int speed;
	
	
	
	public Vehicle(String type,String engine, String fuel,int speed){
		this.type = type;
		this.engine = engine;
		this.fuel = fuel;
		this.speed = speed;
	}
	
	
	public void move(){
		System.out.println("Vehicle  move called!");
	}
	
	
	
}
