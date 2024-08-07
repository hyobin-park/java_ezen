package com.mycompany.ch06.first;

public class CarExTr {

	public static void main(String[] args) {

		CarTr cartr = new CarTr();
		
		System.out.println(cartr.company);
		System.out.println(cartr.name);
		System.out.println(cartr.color);
		System.out.println(cartr.price);
		
		cartr.go();
		cartr.back();
		System.out.println("-------------------");
		
		int total = cartr.sum2(10,15);
		System.out.println(total);
		
		int result3 = cartr.salary("나");
		System.out.println(result3);
		System.out.println("-------------------");
	}
}