package com.mycompany.ch05.Function;

public class Function {

	public static void main(String[] args) {

//		public 리턴 자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//		...
//		return 리턴값; //리턴자료형이 void 인 경우에는 return 문이 필요없다.
//		}

		int result = sum(1, 2);
//		int result2 = sum (4, 3);
//		
		System.out.println(result);
//		System.out.println(result2);
//		
//		 say();
//		 String result3 = sayHello();
//		 System.out.println("result3: " + result3);
//		 sum2 (3, 4);
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		say();
		return sum;
	}

	public static void say() {
		System.out.println("Hi");
	}

	public static String sayHello() {
		return "Hello";
	}

	public static void sum2(int a, int b) {
		int sum2 = a + b;
		System.out.println(a + "+" + b + "=" + sum2);
	}
}
