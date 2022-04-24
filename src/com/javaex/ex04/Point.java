package com.javaex.ex04;

import java.awt.Desktop.Action;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		//메모리에 올리는일
	}
	public Point(int x) {
		//메모리에 올리는일
		this.x = x;
	}
	public Point(int x, int y) {
	//******메모리에 올리는 일(클래스로 인스턴스화)
		this.x = x;
		this.y = y;
	}
	// 메소드 -gs
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 메소드 -일반
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.\n",x,y);
	}
	
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.printf("점[x=%d, y=%d]을 그렸습니다.\n",x,y);
		}else {
			System.out.printf("점[x=%d, y=%d]을 지웠습니다.\n",x,y);
		}
	}
}
