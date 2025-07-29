package week3.day16;

public class Rectangle {
	double length;
	double width;

	// Constructor
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Method to calculate area
	
	public double calculateArea() {
		return length * width;
	}

	// Method to calculate perimeter
	
	public double calculatePerimeter() {
		return (2 * (length + width));
	}
	
	// Main method
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(7.5, 4.0);
		System.out.println("Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());	
	}

}
