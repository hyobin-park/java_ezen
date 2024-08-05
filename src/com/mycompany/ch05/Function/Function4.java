package com.mycompany.ch05.Function;

public class Function4 {

	public static void main(String[] args) {

//		100 이내의 자연수에서 선택된 수만큼 합산
		
		int result = sum(10);
		System.out.println(result);
		
	}
	
	public static int sum(int a, int b) {
		if(a<=100) {
			
		} else {
			for(int i=1; i<=100; i++) {
				sum += i;
			}			
		}
		return a;
	}
	

}
