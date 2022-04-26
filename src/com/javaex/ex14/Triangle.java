package com.javaex.ex14;

public class Triangle {
	String fillColor;
	String lineColor;
	int width;
	int height;

	public Triangle() {
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

	public void draw() {
		System.out.println("면색: " + this.fillColor + ", 선색 :" + this.lineColor + ", 가로 : " + this.width + ", 세로 : "
				+ this.height + " 삼각형을 그렸습니다.");
	}

}
