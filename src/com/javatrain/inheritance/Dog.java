package com.javatrain.inheritance;

public class Dog extends Animal {
	
	private int eyes;
	
	private int legs;
	
	private int tail;
	
	private int teeth;
	
	private String coat;

	public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		// TODO Auto-generated constructor stub
	}
	
	public void chew(){
		System.out.println("Dog are chewing");
	}
	public void eat(){
		System.out.println("Dog are eating");
		System.out.println("eat() inside Dog class");
		super.eat();
	}
	
	public void walk(){
		System.out.println("Dog.walk() are called!");
		super.move(1000);
	}
	
	public void run(){
		System.out.println("Dog.run() are called");
		super.move(2000);
	}

    @Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Dog.move are called");
		moveLegs(speed);
		super.move(speed);
	}

	private void moveLegs(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Dog.moveLegs() called");
		
	}
	
	

	
	
	
	
	

}
