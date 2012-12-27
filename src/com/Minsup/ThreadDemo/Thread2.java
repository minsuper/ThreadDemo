package com.Minsup.ThreadDemo;

public class Thread2 extends Thread {
	public void run() {
		int i;
		
		try {
			for(i=0; i<10; i++) {
				sleep(1500);
				System.out.println("B");
			}
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
