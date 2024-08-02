package com.mycompany.ch05.Array;

public class Array {

	public static void main(String[] args) {

//		list를 이용한 배열 선언
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		
		int scoreChemistry2[] = {100,99,98,97,96,95,94};
		
		
		int[] scoreChemistry3 = new int[7];
		
		int scoreChemistry4[] = new int[7];
		
		System.out.println("scoreChemistry[0]: " + scoreChemistry[0]);
		System.out.println("scoreChemistry[6]: " + scoreChemistry[6]);
		System.out.println("-----------------");
		
//		for문 사용하여 scoreChemistry 출력
//		scoreChemistry.length는 변수의 개수를 출력해줌
		for(int i=0; i<scoreChemistry.length; i++) {
			System.out.println("scoreChemistry[" + i + "]: " + scoreChemistry[i]);
		}
		
		System.out.println("scoreChemistry.length: " + scoreChemistry.length);
		System.out.println("-----------------");
		
		
//		변수에 데이터 넣어주기
		scoreChemistry3[0] = 100;
		scoreChemistry3[1] = 99;
		scoreChemistry3[2] = 98;
		scoreChemistry3[3] = 97;
		scoreChemistry3[4] = 96;
		scoreChemistry3[5] = 95;
		scoreChemistry3[6] = 94;

		
		System.out.println("scoreChemistry3.length: " + scoreChemistry3.length);
		
		for(int j=0; j<scoreChemistry3.length; j++) {
			System.out.println("scoreChemistry3[" + j + "]: " + scoreChemistry3[j]);
		}
		
		
		System.out.println("-----------------");
		
		// 향상된 for문
		int i = 0;
		for(int a: scoreChemistry3) { //int a = scoreChemistry3[0]; 의미
			System.out.println("scoreChemistry3[" + i + "]: " + a);
			i++;
		}
	}

}
