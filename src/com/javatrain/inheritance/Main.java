package com.javatrain.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal animal = new Animal("Animal",1,1,5,5);
		Dog dog1 = new Dog("Fluffy", 8, 20, 2, 4, 1, 2, "long silky");
	    dog1.eat();
	    
	    dog1.move(10);
	    //dog1.run();
	    dog1.move(300);
	}

}
