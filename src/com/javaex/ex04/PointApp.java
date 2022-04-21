package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		Point numx = new Point();
		numx.setX(5);
		numx.setY(5);
		
		Point numy = new Point();
		numy.setX(10);
		numy.setY(23);
		
		numx.draw();
		numy.draw();
	}

}