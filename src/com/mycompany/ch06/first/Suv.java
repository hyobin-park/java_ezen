package com.mycompany.ch06.first;

public class Suv {

	String company = "Mercedes-Benz";
	String name = "마이바흐 GLS클래스 600";
	String color = "블랙";
	int price = 330000000;
	int engine = 6;
	
	void go() {
		System.out.println("액셀");
	}
	
	void back() {
		System.out.println("브레이크");
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	

//			인풋: 문자열(사장,부장,과장,대리,사원,나)
//			직급에 따른 연봉을 알려주는 함수
		
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
				salary = 45000000;
				break;
			}
			case "나": {
				salary =43000000;
				break;
			}
			}
			return salary;
		}
	
}
