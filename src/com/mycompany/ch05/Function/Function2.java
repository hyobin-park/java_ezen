package com.mycompany.ch05.Function;

public class Function2 {

	public static void main(String[] args) {
		
//		public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//		   ...
//		   return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
//		}

//		인풋: 정수, 아웃풋: 문자열("짝수, 홀수")
//		짝수인지 홀수인지 구별하는 함수
		
		String result =  num(7);
		System.out.println(result);
		
	}

	public static String num(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}

	}
	
}
