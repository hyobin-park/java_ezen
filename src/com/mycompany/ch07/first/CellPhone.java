package com.mycompany.ch07.first;

public class CellPhone {
	
	// field
	public String model;
	public String color;
	
	// 생성자
	
	// 메소드
	void powerOn() { System.out.println("전원을 켭니다."); 	}
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println(""); }
	void recieveVoice(String message) {System.out.println(""); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
	void powerOn(int a) {System.out.println("전원을 끕니다.2"); }
	

}