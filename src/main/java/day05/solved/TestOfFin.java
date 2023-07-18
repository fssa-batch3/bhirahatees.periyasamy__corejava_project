package day05.solved;

abstract class Polygon2 {
	protected int numberOfSides;

	public Polygon2(int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		} else {
			this.numberOfSides = numberOfSides;
		}
	}

	public abstract double calculateArea();
}

class Rectangle2 extends Polygon2 {

	protected double length;
	protected double breadth;

	public Rectangle2(double length, double breadth) throws Exception {
		super(4);
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		return this.length * this.breadth;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	
}

final class Square3 extends Rectangle2 {

	public Square3(double side_length) throws Exception {
		super(side_length, side_length);
	}
}

public class TestOfFin {
	public static void main(String[] args) {
		try {
			Rectangle2 rectangle = new Rectangle2(5.0, 3.0);
			System.out.println("Rectangle Area: " + rectangle.calculateArea());
			System.out.println("Number of sides: " + rectangle.getNumberOfSides());


			Square3 square = new Square3(4.0);
			System.out.println("Square Area: " + square.calculateArea());
			System.out.println("Number of sides: " + square.getNumberOfSides());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
