package javaassignment9;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s = new Circle(34);
		System.out.println(s.area());
		System.out.println(s.perimeter());

		s = new Rectangle(34, 12);
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}
}

class Shape {
	public double area() {
		return 0.0;
	}

	public double perimeter() {
		return 0.0;
	}

}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}

class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2 * (length + width);
	}
}
