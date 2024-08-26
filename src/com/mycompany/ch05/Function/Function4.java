package com.mycompany.ch05.Function;

public class Function4 {

	public static void main(String[] args) {

//		100 이내의 자연수에서 선택된 수만큼 합산
		
		int result = numbers(10);
		System.out.println(result);
	}
	
	// 정수
	public static int numbers(int a) {
		int sum = 0;
		
		if(a<=100) {
			for(int i=1; i<=a; i++) {
				sum += i;
			}	
		}
		return sum;
	}
	

}
