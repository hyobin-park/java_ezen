package com.mycompany.ch06.first;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("car.engine: " + car.engine); //Car field에 있는 engine 함수 사용
		System.out.println("car.name: " + car.name);
		System.out.println("car.color: " + car.color);
		System.out.println("car.company: " + car.company);
		
		
		car.go();
		car.back();
		
	}

}
