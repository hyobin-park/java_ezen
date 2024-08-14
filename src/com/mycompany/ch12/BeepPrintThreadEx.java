package com.mycompany.ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {

//		방법 1
//		Thread thread = new Thread(new Runnable() {
//		
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try {Thread.sleep(500); } catch(Exception e) {}
//					}
//				}	
//			});
//		
//		thread.start();
		
		
//		방법 2
		
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Tony");
			try { Thread.sleep(500); } catch(Exception e) {}
		} 
		
	}

}
