package com.mycompany.ch03;

public class StringConcat7 {

	public static void main(String[] args) {

//		문자열 연산자 (+)
		
		String stringVal = "jdk ";
		String stringVal2 = "1.17";
		String stringVal5 = "10";
		
		String stringVal3 = stringVal + stringVal2;
		System.out.println("stringVal3: " + stringVal3);
		System.out.println("우리가 사용하는 jdk 버전은 " + stringVal3);
		
		int a = 1;
		
		String stringVal4 = stringVal + a;
		System.out.println("stringVal4: " + stringVal4);
		
//		String stringVal6 = stringVal5 + a;		
		int stringVal6 = Integer.parseInt(stringVal5) + a; // 문자열 > 상수로 변경 
		System.out.println("stringVal6: " + stringVal6);
		
	}

}
