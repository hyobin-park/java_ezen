package com.mycompany.ch06.first;

public class CarTr {
	
	// field
	String company = "현대자동차";
	String name = "Avante";
	String color = "White";
	int price = 20000000;
	
	void go() {
		System.out.println("전진");
	}
	
	void back() {
		System.out.println("후진");
	}
	
	public int sum2(int i, int j) {
		int result2 = i + j;
		return result2;
	}
	
//	인풋: 문자열(사장,부장,과장,대리,사원,나)
//	직급에 따른 연봉을 알려주는 함수
	
	public int salary(String position) {
		int salary = 0;
		switch(position) {
		case "사장": {
			salary = 150000000;
			break;
		}
		case "부장": {
			salary = 100000000;
			break;
		}
		case "과장": {
			salary = 80000000;
			break;
		}
		case "대리": {
			salary = 55000000;
			break;
		}
		case "사원": {
			salary = 40000000;
			break;
		}
		case "나": {
			salary = 55000000;
			break;
		}
		}
		return salary;
	}
	

}
