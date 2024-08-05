package com.mycompany.ch06.first;

public class Suv {

	String company = "Mercedes-Benz";
	String name = "마이바흐 GLS클래스 600";
	String color = "블랙";
	int price = 330000000;
	int engine = 6;
	
	void go() {
		System.out.println("액셀");
	}
	
	void back() {
		System.out.println("브레이크");
	}
	
	public int sum(int a, int b) {
		int result = a + b;		
		return result;
	}
	
}
