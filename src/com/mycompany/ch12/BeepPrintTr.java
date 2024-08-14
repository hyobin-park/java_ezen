package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepPrintTr {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("12");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
