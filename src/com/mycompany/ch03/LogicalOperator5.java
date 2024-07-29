package com.mycompany.ch03;

public class LogicalOperator5 {

	public static void main(String[] args) {

//		논리연산자 (&, &&, |, ||, ^)
//		&& = & : and : 논리곱
//		|| = | : or : 논리합
//		^ : 배타적 논리합 : 연산 참 참-폴스, 폴스 폴스-폴스, 참 폴스-참, 폴스 참-참
		
		int a = 65;
		
		if(a >= 65 && a <= 70) {
			System.out.println("&&: True");
		}
			
		if(a >= 65 & a <=70) {
			System.out.println("&: True");
		}
		
		if(a > 65 || a <=70) {
			System.out.println("||: True");
		}
		
		if(a > 65 | a <= 70) {
			System.out.println("|: True");
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^1: True");
		}
		
	}

}
