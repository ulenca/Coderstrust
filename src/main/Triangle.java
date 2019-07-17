package main;

public class Triangle implements Figure{
	
	private double height;
	private double side_lenght;
	
	public Triangle(double height, double side_lenght) {
		
		if(height<0 || side_lenght<0) {throw new IllegalArgumentException("Side lenght or height shouldn't be less ten zero!");}
		
		this.height=height;
		this.side_lenght=side_lenght;
	}
	
	@Override
	public double calculateArea() {
		return (height*side_lenght)/2;
	}	
	
	public double getHeight() {
		return height;
	}

	public double getSide_lenght() {
		return side_lenght;
	}




}
