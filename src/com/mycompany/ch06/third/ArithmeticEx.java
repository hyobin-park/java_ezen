package com.mycompany.ch06.third;

public class ArithmeticEx {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		System.out.println("arithmetic.a: " + arithmetic.a);
		System.out.println("arithmetic.b: " + arithmetic.b);
		
		
		arithmetic.sum(10,6);
		System.out.println("sum: " + arithmetic.sum);
		
		arithmetic.minus(10,6);
		System.out.println("minus: " + arithmetic.minus);
		
		arithmetic.multiply(10,6);
		System.out.println("multiply: " + arithmetic.multiply);
		
		arithmetic.divide(10,6);
		System.out.println("divide: " + arithmetic.divide);
		
		arithmetic.remain(10,6);
		System.out.println("remain: " + arithmetic.remain);
	}

}
