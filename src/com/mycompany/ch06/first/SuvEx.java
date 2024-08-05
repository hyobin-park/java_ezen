package com.mycompany.ch06.first;

public class SuvEx {

	public static void main(String[] args) {

		Suv suv = new Suv();
		
		System.out.println("suv.company: " + suv.company);
		System.out.println("suv.name: " + suv.name);
		System.out.println("suv.color: " + suv.color);
		System.out.println("suv.price: " + suv.price);
		System.out.println("suv.engine: " + suv.engine);

		suv.go();
		suv.back();
		
		
		int sum2 = suv.sum(10, 15);
		System.out.println(sum2);
		
//		System.out.println(suv.sum(10, 15));
		
	}

}
