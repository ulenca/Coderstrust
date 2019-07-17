package main;

public class Rectangle implements Figure{
	
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		
		if(height<0 || width<0) {throw new IllegalArgumentException("Sides lenght shouldn't be less ten zero!");}
		
		this.height=height;
		this.width=width;
	}

	@Override
	public double calculateArea() {		
		return height*width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}


}
