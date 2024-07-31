package com.mycompany.ch04;

public class For2 {

	public static void main(String[] args) {

//		1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		System.out.println("--------------------------");
		
		
//		11~50까지 짝수의 합을 구하시오
		
		int sum2 = 0;
		
		for(int i=11; i<=50; i++) {
			if(i%2 == 0) {
				sum2 += i;
			}
		} System.out.println("11부터 50까지의 짝수 합은 " + sum2 + "입니다.");
		
		
	}

}
