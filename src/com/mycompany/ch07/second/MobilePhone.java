package com.mycompany.ch07.second;

public class MobilePhone extends Phone {
		
	@Override
	public void makeCall() {
		System.out.println("전화걸기.mobilePhone");
	}
	
	@Override
	public void recieveCall() {
		System.out.println("전화받기.mobilePhone");
	}
	
	@Override
	public void connect() {
		System.out.println("무선 기지국 연결.mobilePhone");
	}
	
	@Override
	public void battery() {
		System.out.println("배터리 충전하기.mobilePhone");
	}
	
	

}
