package day04.practice;

public class Rectangle {

	protected int length;
	protected int breadth;

	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int Area() {
		return length * breadth;
	}

}


class Square extends Rectangle {

	public Square() {	
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	 public static void main(String[] args) {
	        Square square = new Square(3);
	        int area = square.Area();
	        int length = square.getLength();
	        System.out.println( "The get length is called from parent which is "+length );
	        System.out.println( "The area of the square is calculated is "+area);
	    }

}