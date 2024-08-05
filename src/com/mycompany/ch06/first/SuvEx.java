package com.mycompany.ch06.first;

public class SuvEx {

	public static void main(String[] args) {

		Suv suv = new Suv();
		
		System.out.println("suv.company: " + suv.company);
		System.out.println("suv.name: " + suv.name);
		System.out.println("suv.color: " + suv.color);
		System.out.println("suv.price: " + suv.price);
		System.out.println("suv.engine: " + suv.engine);

		suv.go();
		suv.back();
		
		int sum2 = suv.sum(10, 15);
		System.out.println(sum2);
		System.out.println("---------------------");
//		System.out.println(suv.sum(10, 15)); 로도 표기 가능
		
	
//		인풋: 문자열(사장,부장,과장,대리,사원,나)
//		직급에 따른 연봉을 알려주는 함수
		
		int result = suv.salary("나");
		System.out.println("나: " + result);
		
		
	}

}
