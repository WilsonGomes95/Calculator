package Entities;

public abstract class Shape {
	private String Color;
	
	
	
	
	
	public Shape() {
		super();
	}


	public Shape(String color) {
		super();
		Color = color;
	}



	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public abstract double area();

}
