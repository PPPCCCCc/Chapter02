package com.javaex.ex15;

public class Circle extends Shape{
	int radius;

	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor,int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public void draw() {
		System.out.println(
				"[면색 : " + this.fillColor + ", 선색 :" + this.lineColor + ", 반지름 : " + this.radius+"]" + " 원을 그렸습니다.");
	}
	
}
