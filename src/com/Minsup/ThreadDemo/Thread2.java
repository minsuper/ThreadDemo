package com.Minsup.ThreadDemo;

public class Thread2 extends Thread {
	X x;
	
	Thread2(X x) {
		this.x = x;
	}
	
	public void run() {
		int i;

		for(i=0; i<100000;i++) {
			x.x1();
		}
		/*
		try {
			for(i=0; i<10; i++) {
				sleep(1500);
				System.out.println("B");
			}
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		*/
	}
}
