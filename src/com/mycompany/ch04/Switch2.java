package com.mycompany.ch04;

public class Switch2 {

	public static void main(String[] args) {

//		사장, 부장, 과장, 대리, 주임, 사원, 나
//		사장의 연봉은 얼마 입니다.
		
		String position = "사원";
		
		switch(position) {
		case "사장": {
			System.out.println("연봉은 1억 입니다.");
			break;
		}
		case "부장": {
			System.out.println("연봉은 8,000 입니다.");
			break;
		}
		case "과장": {
			System.out.println("연봉은 6,000 입니다.");
			break;
		}
		case "대리": {
			System.out.println("연봉은 5,000 입니다.");
			break;
		}
		case "주임": {
			System.out.println("연봉은 4,000 입니다.");
			break;
		}
		case "사원": {
			System.out.println("연봉은 3,500 입니다.");
			break;
		}
		case "나": {
			System.out.println("연봉은 4,000 입니다.");
			break;
		}
		default: {
			System.out.println("재 확인하세요.");
			break;
		}
	}
}
}