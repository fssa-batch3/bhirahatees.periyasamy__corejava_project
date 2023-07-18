package day05.solved.hasA;

import day05.solved.hasA.*;

public class HasAreDemo {
	public static void main(String[] args) {

		Engine engine1 = new Engine("1000cc");

		Car marutiCar = new Car("Maruti", engine1);

		marutiCar.printCarDetails();

	
		Engine engine2 = new Engine("1500cc");

	
		Car benz = new Car("Mercedes Benz", engine2);

		benz.printCarDetails();

	}
}