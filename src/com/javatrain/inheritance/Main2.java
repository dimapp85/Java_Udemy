package com.javatrain.inheritance;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla tesla  = new Tesla("Tesla", null, null, 0, 0, null, false, 0, 0, 0);
		tesla.move();
		tesla.turnLeft();
		tesla.turnRight();
		tesla.changegear(true);
		tesla.charge();

	}

}
