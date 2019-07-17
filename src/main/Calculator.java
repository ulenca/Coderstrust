package main;


public class Calculator {

	public static void main(String[] args) {

		Figure rectangle = new Rectangle(20.03, 20.04);
		Figure square = new Square(10);
		Figure circle = new Circle(7.1);
		Figure triangle = new Triangle(10,5);
		Figure trapezoid = new Trapezoid(2,2,90);
				
		System.out.println("Rectangle area="+rectangle.calculateArea());
		System.out.println("Square area="+square.calculateArea());
		System.out.println("Circle area="+circle.calculateArea());
		System.out.println("Triangle area="+triangle.calculateArea());
		System.out.println("Trapezoid area="+trapezoid.calculateArea());
	}

}
