package main;

public class Trapezoid implements Figure{
	
	private double base1;
	private double base2;
	private double height;
	
	public Trapezoid(double base1, double base2, double height) {
		
		if(height<0 || base1<0 || base2<0) {throw new IllegalArgumentException("Bases or height shouldn't be less ten zero!");}
		
		this.base1=base1;
		this.base2=base2;
		this.height=height;
	}
	
	@Override
	public double calculateArea() {
		return height*(base1+base2)/2;
	}
	
	public double getBase1() {
		return base1;
	}

	public double getBase2() {
		return base2;
	}

	public double getHeight() {
		return height;
	}

}
