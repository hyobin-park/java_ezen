package com.mycompany.ch02;

public class VariableEx {
	
//		상수 표기법
	static final int SOCIAL_SECURITY_NUMBER = 1111;
	
//		스네이크 표기법 (잘 쓰이지 않음)
	int social_security_number;
	
//		파스칼 표기법: 클래스
	int SocialSecurityNumber;
	
//		카멜 표기법: 변수, 함수 - 첫 글자만 소문자, 나머지 대문자
	int socialSecurityNumber;

	public static void main(String[] args) {
		
//		JAVA는 대소문자를 구분하여 사용한다!
		int number = 1;
		int Number = 2;
		
		System.out.println(number + " : " + Number);
		
//		-------
		
		int a; // 값이 없음 = 할당되지 않음 (정수면 '0' / 소숫점이면 '0.0' / 문자열은 " " 으로 값 필수로 주기)
		int b = 1;
		
		int c = 0;
		
//		c = a + b; // a 오류 (값이 할당되지 않아 변수 생성 X)
		
//		-------
		
//		변수의 범위
//		변수는 선언됨 블럭 내에서만 사용 가능하다.
		int d = 1;
		
		if(d == 1) {
			int aaa = 10;
			int bbb = aaa + d;
			System.out.println("bbb: " + bbb);
		} else {
			
		}
		
//		System.out.println("aaa: " + aaa); // if문 안에서 선언한 변수는 그 안에서만 사용 가능, 오류 발생
//		System.out.println("bbb: " + bbb);
		System.out.println("d: " + d);

		
	}

}
