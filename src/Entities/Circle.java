package Entities;

public class Circle extends Shape{
	private Double radius;
	
	
	
	public Circle() {
	}
	
	
	public Circle(Double radius,String Color) {
		super(Color);
		this.radius = radius;
	}


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
