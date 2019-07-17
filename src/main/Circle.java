package main;

public class Circle implements Figure{

	private double radius;
	
	public Circle(double radius) {
		
		if(radius<0) {throw new IllegalArgumentException("Radius shouldn't be less ten zero!");}
		
		this.radius=radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}

}
