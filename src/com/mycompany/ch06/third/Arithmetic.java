package com.mycompany.ch06.third;

public class Arithmetic {
	
//	사칙연산 함수 생성(+,-,*,/,%)

	int a;
	int b;
	int sum;
	int minus;
	int multiply;
	int divide;
	int remain;	
	
	public int sum(int a, int b) {
		sum = a + b;
		return sum;
	}
	
	public int minus(int a, int b) {
		minus = a - b;
		return minus;
	}
	
	public int multiply(int a, int b) {
		multiply = a * b;
		return multiply;
	}
	
	public int divide(int a, int b) {
		divide = a / b;
		return divide;
	}
	
	public int remain(int a, int b) {
		remain = a % b;
		return remain;
	}
	
	
	
}
