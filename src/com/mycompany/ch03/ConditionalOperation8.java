package com.mycompany.ch03;

public class ConditionalOperation8 {

	public static void main(String[] args) {

//		상황 연산자 (조건식) ? A : B
		
		int math = 85;
		
		char grade = (math > 90) ? 'A' : 'B';
		System.out.println("grade: " + grade);
		
		
//		값이 0인 변수 선언
//		선언한 변수의 값이 0이면 10 대입 아니면 20 대입
		
		int a = 0;
		
		int b = (a == 0) ? 10 : 20;
		System.out.println("b: " + b);
		
	}

}
