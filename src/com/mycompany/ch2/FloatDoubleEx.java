package com.mycompany.ch2;

public class FloatDoubleEx {

	public static void main(String[] args) {

		float var1 = 3.14F; // float는 뒤에 'f' 혹은 'F'를 붙여줘야 함, 주로 대문자 사용
		
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		
//		정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var4);
		System.out.println(var5);
	}

}
