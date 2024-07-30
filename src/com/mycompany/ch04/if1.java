package com.mycompany.ch04;

public class if1 {

	public static void main(String[] args) {

		// if - 학점 계산
		// A: 90 : 97 93
		// B: 89 ~ 80
		// C: 79 ~ 70
		// D: 69 ~ 60
		// F: 59 ~
		
	/*	int score = 87;
		
		if(score >= 90) {
			System.out.println(score + "점은 A 입니다.");
		} else if (score >= 80) {
			System.out.println(score + "점은 B 입니다.");
		} else if (score >= 70) {
			System.out.println(score + "점은 C 입니다.");
		} else if (score >= 60) {
			System.out.println(score + "점은 D 입니다.");
		} else {
			System.out.println(score + "점은 F 입니다.");
		} */
		
		
	/*	if문 성적 && 사용하여 출력하기

	  	int score = 79;
		
		if(score >= 90) {
			System.out.println(score + "점은 A 입니다.");
		} else if (score >= 89 && score >= 80) {
			System.out.println(score + "점은 B 입니다.");
		} else if (score >= 79 && score >= 70) {
			System.out.println(score + "점은 C 입니다.");
		} else if (score >= 69 && score >= 60) {
			System.out.println(score + "점은 D 입니다.");
		} else {
			System.out.println(score + "점은 F 입니다.");
		} */
		
		
		int score = 83;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println(score + "점은 A+ 입니다.");
			} else if (score >= 93) {
				System.out.println(score + "점은 A0 입니다.");
			} else {
				System.out.println(score + "점은 A- 입니다.");
			}
		} else if (score >= 89 && score >= 80) {
			if(score >= 87) {
				System.out.println(score + "점은 B+ 입니다.");
			} else if (score >= 83) {
				System.out.println(score + "점은 B0 입니다.");
			} else {
				System.out.println(score + "점은 B- 입니다.");
			}
		} else if (score >= 79 && score >= 70) {
			if(score >= 77) {
				System.out.println(score + "점은 C+ 입니다.");
			} else if (score >= 73) {
				System.out.println(score + "점은 C0 입니다.");
			} else {
			System.out.println(score + "점은 C- 입니다.");
			}
		} else if (score >= 69 && score >= 60) {
			System.out.println(score + "점은 D 입니다.");
		} else {
			System.out.println(score + "점은 F 입니다.");
		}
		
		
	}

}
