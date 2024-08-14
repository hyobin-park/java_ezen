package com.mycompany.ch12;

import java.awt.Toolkit; //Ctrl + Shift + o 누르면 import 값 생성됨

public class BeepEx {

	public static void main(String[] args) {

		//'Toolkit' 상 빨간줄 발생 시 [Ctrl + Shift + O]
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		
		for(int i=0; i<5; i++) {
			toolkit.beep(); 			// '삐' 소리를 나게 하는 코드
			try {
				Thread.sleep(500); 		// 프로그램 실행을 500밀리초(0.5초) 동안 지연시키는 코드
			} catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
