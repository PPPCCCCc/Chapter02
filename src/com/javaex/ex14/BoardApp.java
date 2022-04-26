package com.javaex.ex14;

public class BoardApp {

	public static void main(String[] args) {

		Ractangle[] rac = new Ractangle[2];

		Ractangle R1 = new Ractangle("빨강", "검정", 4, 4);
		Ractangle R2 = new Ractangle("주황", "검정", 5, 5);
		rac[0] = R1;
		rac[1] = R2;

		for (int i = 0; i < rac.length; i++) {
			rac[i].draw();
		}

		Triangle[] tri = new Triangle[2];

		Triangle T1 = new Triangle("빨강", "검정", 4, 4);
		Triangle T2 = new Triangle("보라", "검정", 10, 10);
		tri[0] = T1;
		tri[1] = T2;

		for (int i = 0; i < tri.length; i++) {
			tri[i].draw();
		}
		Circle[] cir = new Circle[2];

		Circle C1 = new Circle("보라", "빨강", 3);
		Circle C2 = new Circle("보라", "검정", 3);
		cir[0] = C1;
		cir[1] = C2;

		for (int i = 0; i < cir.length; i++) {
			cir[i].draw();
		}

	}

}
