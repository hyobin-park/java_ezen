package com.mycompany.ch04;

public class If_tr {

	public static void main(String[] args) {

		int grade = 55;
		
		if(grade >= 90) {
			if(grade >= 97) {
				System.out.println("A+");
			} else if(grade >= 93) {
				System.out.println("A0");
			} else {
				System.out.println("A-");
			}
		} else if(grade >= 80) {
			if(grade >= 87) {
				System.out.println("B+");
			} else if(grade >= 83) {
				System.out.println("B0");
			} else {
				System.out.println("B-");
			}
		} else if(grade >= 70) {
			if(grade >= 77) {
				System.out.println("C+");
			} else if(grade >= 73) {
				System.out.println("C0");
			} else {
				System.out.println("C-");
			}
		} else if(grade >= 60) {
			if(grade >= 67) {
				System.out.println("D+");
			} else if(grade >= 63) {
				System.out.println("D0");
			} else {
				System.out.println("D-");
			} 
		} else {
			System.out.println("F");
		}
		
		
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
		}
	}

}
