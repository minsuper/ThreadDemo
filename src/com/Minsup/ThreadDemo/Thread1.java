package com.Minsup.ThreadDemo;

public class Thread1 extends Thread {

	CommonStorage CS;
	
	Thread1(CommonStorage CS) {
		this.CS = CS;
	}
	
	public void run() {
		int i;
		
		try {
			for(i=0; i<10000; i++) {
				//sleep(1);
				System.out.println(this.getName() + " : " + CS.getData());
				CS.increaseN();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
