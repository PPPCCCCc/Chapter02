package com.javaex.ex13;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
		
	public void showInfo() {
		System.out.print(this.color+", ");
		super.showInfo();

	}
	
}
