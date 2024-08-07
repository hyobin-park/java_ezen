package com.mycompany.ch07.first;

public class DmbCellPhone extends CellPhone{
	
	// child class
	
	@Override
	void powerOn() {
		System.out.println("자식의 전원을 켭니다.");
	}
	
	// field
	public int channel;
	
	// 메소드
	void turnOnDmb() {
//		powerOn();
		System.out.println("채널 " + channel + "번 DMB 켜줘.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿔줘");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	void turnOffDmb(int a) {
		
	}
	

}
