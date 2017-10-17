package com.javatrain.inheritance;

public class Fish extends Animal {

	public Fish(String name, int size, int weight,int gills,int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.gills = gills;
		this.fins = fins;
		// TODO Auto-generated constructor stub
	}

	private int gills;
	
	private int eyes;
	
	private int fins;
}
