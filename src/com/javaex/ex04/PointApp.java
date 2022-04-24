package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		Point numx = new Point();
		numx.setX(5);
		numx.setY(5);
		
		Point numy = new Point();
		numy.setX(10);
		numy.setY(23);
		
		Point numj = new Point(10,20);
		
		Point numi = new Point(100);
		numi.setY(200);
		
		//y값을 먼저 넣고
		//setter x값을 넣는다
		//안됨
		Point numk = new Point(500);
 		
		numx.draw();
		numy.draw();
		numj.draw();
		
		numx.draw(true);
		numx.draw(false);
	}

}