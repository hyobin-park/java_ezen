package com.mycompany.ch2;

public class CharEx {

	public static void main(String[] args) {

		char var = 'A';
//		char var2 = "A"; 오류 발생 - 쌍따음표 내 한글자 작성 시 오류
//		char var2 = 'park'; 오류 발생 - 따음표 내 여러 글자 작성 시 오류
		
		char var11 = 'A';
//		10진수 저장
		char var12 = 65;
//		16진수 저장
		char var13 = '\u0041';
		
		System.out.println("var11: " + var11);
		System.out.println("var12: " + var12);
		System.out.println("var13: " + var13);
		
	}

}
