package com.mycompany.ch04;

public class if5 {

	public static void main(String[] args) {

//		int 타입의 변수를 3개 선언하고
//		세 정수 중에서 최대값, 최소값을 구하는 프로그램을 작성하시오
		
//		System.out.println("최대값은 : " + a);
//		System.out.println("최소값은 : " + a);
		
		int a = 2;
		int b = 3;
		int c = 1;
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}

		
	}

}