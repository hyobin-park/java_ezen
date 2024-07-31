package com.mycompany.ch04;

public class For1 {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			System.out.println("i: " + i);
		}
		System.out.println("--------------------");
		
		
//		2단부터 출력되는 구구단 프로그램을 작성하시오
//		각 단계 마다 구분선을 넣어 주세요.
//		2 * 1 = 2
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				int multiply = i * j;
				System.out.println(i + " * " + j + " = " + multiply);
			} 
			if(i != 9) {
				System.out.println("--------------------");
			} else {
//				by pass
			}
		} 
		
	}

}
