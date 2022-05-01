package com.javaex.ex19;

public class Ex03 {

	public static void main(String[] args) {
		String str = new String("hello");
		str = null;
		
				
				
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("주소 값은 없습니다.");
		}finally {
			
		}
	}

}
