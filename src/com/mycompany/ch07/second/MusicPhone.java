package com.mycompany.ch07.second;

public class MusicPhone extends Phone {
	
	@Override
	public void makeCall() {
		System.out.println("전화걸기.musicPhone");
	}
	
	@Override
	public void recieveCall() {
		System.out.println("전화받기.musicPhone");
	}
	
	@Override
	public void connect() {
		System.out.println("무선 기지국 연결.musicPhone");
	}
	
	@Override
	public void battery() {
		System.out.println("배터리 충전하기.musicPhone");
	}
	
	public void downMusic() {
		System.out.println("음악 다운받기.musicPhone");
	}
	
	public void playMusic() {
		System.out.println("음악 재생하기.musicPhone");
	}
	

}
