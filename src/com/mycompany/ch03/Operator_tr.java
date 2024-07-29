package com.mycompany.ch03;

public class Operator_tr {

	public static void main(String[] args) {

//		부호연산자
		int x = 10;
		
		int a = +x;
		int b = -x;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("-----------------");
	
	
//		증감연산자 (++, --)
		int y = 20;
		
		int c = ++y;
		int d = y++;
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		y++;
		int e = --y;
		int f = y--;
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("-----------------");
		
		
//		산술 연산자 (=,-,*,/,%)
		int v1 = 8;
		int v2 = 10;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		System.out.println("-----------------");
		
		
//		비교 연산자 (==, !=, <, <=, >, >=)
		
		int g = 10;
		int h = 20;
		
		boolean result6 = (g==h);
		System.out.println("result6: " + result6);
		
		boolean result7 = (g!=h);
		System.out.println("result7: " + result7);
		
		boolean result8 = (g<h);
		System.out.println("result8: " + result8);
		
		boolean result9 = (g<=h);
		System.out.println("result9: " + result9);
		
		boolean result10 = (g>h);
		System.out.println("result10: " + result10);
		
		boolean result11 = (g>=h);
		System.out.println("result11: " + result11);
		System.out.println("-----------------");
		
		
//		논리연산자 (&, &&, |, ||, ^)
		int i = 55;
		
		if(i>=50 && i<=60) {
			System.out.println("&&: True");
		}
		
		if(i>=50 & i<=60) {
			System.out.println("&&: True");
		}
		
		if(i>55 || i<=60) {
			System.out.println("||: True");
		}
		
		if(i>55 | i<=60) {
			System.out.println("|: True");
		}
		
		if(i>55 ^ i<=60) {
			System.out.println("^1: True");
		}
		System.out.println("-----------------");
		
		
//		대입 연산자 (+=,-=,*= ....)
		int result12 = 10;
		int result13 = 11;
		int result14 = 12;
		
		result12 += 15;
		System.out.println("result12: " + result12);
		
		result13 -= 15;
		System.out.println("result13: " + result13);
		
		result14 *= 15;
		System.out.println("result14: " + result14);
		System.out.println("-----------------");
		
		
//		문자열 연산자 (+)
		String stringVal = "안녕하세요";
		String stringVal1 = "55";
		
		String stringVal2 = stringVal + stringVal1;
		System.out.println("stringVal2: " + stringVal2);
			
		int j = 2;
		String stringVal3 = stringVal + j;
		System.out.println("stringVal3: " + stringVal3);
		
		int stringVal4 = Integer.parseInt(stringVal1) + j;
		System.out.println("stringVal4: " + stringVal4);
		System.out.println("-----------------");
		
//		상황 연산자 (조건식) ? A : B
		int eng = 90;
		
		char grade = (eng >= 90) ? 'A' : 'B';
		System.out.println("grade: " + grade);
		
		
	}

}
