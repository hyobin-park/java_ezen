package com.mycompany.ch06.fourth;

public class CalculatorEx {

	public static void main(String[] args) {

//		Calculator calculator = new Calculator();
//		위에 내용 생략 가능! 다만, 아래와 같이 class명인 "Calculator.변수명" 기재해주기
		
		System.out.println("Calculator.pi: " + Calculator.pi);
		
		add(1,2);
		
		int result = Calculator.addStatic(1,2);
		System.out.println(result);
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		int result = add(1,2);
		return a - b;
	}

}
