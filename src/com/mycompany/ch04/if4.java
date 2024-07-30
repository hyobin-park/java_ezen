package com.mycompany.ch04;

public class if4 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
//		System.out.println("(a,b)는 1사분면에 위치합니다.");
		
		int a = 10;
		int b = 15;
		
		if(a>0 && b>0) {
			System.out.println("(10,15)는 1사분면에 위치합니다.");
		} else if (a<0 && b>0) {
			System.out.println("(10,15)는 2사분면에 위치합니다.");
		} else if (a<0 && b<0) {
			System.out.println("(10,15)는 3사분면에 위치합니다.");
		} else if (a>0 && b<0){
			System.out.println("(10,15)는 4사분면에 위치합니다.");
		}
		
		
	/* 선생님 코딩 - 예외도 꼭 코딩해주기
	 	int a = -2;
		int b = 0;
		
		if(a>0 && b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b>0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 && b!= 0) {
			System.out.println("(a,b)는 x축 위에 있습니다");
		} else if(a!=0 && b== 0) {
			System.out.println("(a,b)는 y축 위에 있습니다");
		} else {
			// a==0 & b==0
			System.out.println("(a,b)는 원점입니다.");
		} */
		
	}

}
