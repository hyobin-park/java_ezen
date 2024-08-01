package com.mycompany.ch05;

public class FunctionTr {

	public static void main(String[] args) {

//		인풋: 정수, 아웃풋: 문자열("짝수, 홀수")
//		짝수인지 홀수인지 구별하는 함수
		
		String result = num(7);
		System.out.println(result);
		
//		세 수를 주면 최대값을 반환하는 함수

		int result3 = max(2, 5, 7);
		System.out.println(result3);
		
	}

	public static String num(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	public static int max(int i, int j, int k) {
		int result2 = 0;
		if(i != j && i != k && j != k) {
			if(i>j && i>k) {
				result2 = i;
			} else if(j>i && j>k) {
				result2 = j;
			} else {
				result2 = k;
			}
		}
		return result2;
	}
	
}
