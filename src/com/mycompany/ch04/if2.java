package com.mycompany.ch04;

public class if2 {

	public static void main(String[] args) {
		
//		일반:1 5% 할인적용
//		브론즈:2 10% 할인적용
//		실버:3 15% 할인적용
//		골드:4 20% 할인적용
//		플래티넘:5 25% 할인적용

//		정가가 12000원인 실버등급의 할인가는: 10200원 입니다.

		int grade = 3;
		int cost = 12000;
		
		double salesCost = 0.0;
		
		if(grade == 1) {
			double a = cost * 0.95;
			System.out.println("정가가 12000원인 일반등급의 할인가는: " + a + "원 입니다.");
		} else if (grade == 2) {
			double b = cost * 0.9;
			System.out.println("정가가 12000원인 브론즈등급의 할인가는: " + b + "원 입니다.");
		} else if (grade == 3) {
			double c = cost * 0.85;
			System.out.println("정가가 12000원인 실버등급의 할인가는: " + c + "원 입니다.");
		} else if (grade == 4) {
			double d = cost * 0.8;
			System.out.println("정가가 12000원인 골드등급의 할인가는: " + d + "원 입니다.");
		} else {
			double e = cost * 0.75;
			System.out.println("정가가 12000원인 플래티넘등급의 할인가는: " + e + "원 입니다.");
		}
		
		
	/* 	선생님의 예시
	 	if(grade == 1) {
			salesCost = cost * (1-0.05);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if(grade == 2) {
			salesCost = cost * (1-0.1);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if(grade == 3) {
			salesCost = cost * (1-0.15);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if(grade == 4) {
			salesCost = cost * (1-0.2);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if (grade == 5) {
			salesCost = cost * (1-0.027);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else {
			System.out.println("1~5 까지의 grade 만 가능합니다.");
		} */
		
	
	}

}
