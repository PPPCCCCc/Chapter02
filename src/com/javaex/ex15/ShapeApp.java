package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		//Shape s01 = new Shape("빨강", "노랑");
		//System.out.println(s01.toString());
		//s01.draw();
		
		Rectangle[] rac = new Rectangle[2];
		
		Rectangle r01 = new Rectangle("빨강","검정",4,6);
		Rectangle r02 = new Rectangle("파랑","검정",7,7);
		rac[0] = r01;
		rac[1] = r02;
		for (int i = 0; i < rac.length; i++) {
			rac[i].draw();
		}

		Triangle[] tri = new Triangle[2];
		
		Triangle t01 = new Triangle("검정","빨강",5,5);
		Triangle t02 = new Triangle("검정","파랑",10,10);
		tri[0] = t01;
		tri[1] = t02;
		for (int i = 0; i < tri.length; i++) {
			tri[i].draw();
		}
		
		Circle[] cir = new Circle[2];
		
		Circle c01 = new Circle("보라","빨강",5);
		Circle c02 = new Circle("파랑","보랑",10);
		cir[0] = c01;
		cir[1] = c02;
		for (int i = 0; i < cir.length; i++) {
			cir[i].draw();
		}
	}

}
