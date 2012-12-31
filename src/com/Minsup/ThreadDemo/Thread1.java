package com.Minsup.ThreadDemo;

public class Thread1 extends Thread {

	CommonStorage CS;
	private boolean timerExpired = false;
	
	Thread1(CommonStorage CS) {
		this.CS = CS;
	}
	
	public void TimerExpired() {
		timerExpired = true;
	}
	
	public void run() {
		int i;
		
		try {
			for(i=0; i<1000; i++) {
				sleep(2);
//				System.out.println(this.getName() + " : " + CS.getData());
				CS.increaseN();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		synchronized (this) {
			try {
				System.out.println("Before wait");
				if(timerExpired == false)
					wait(); 
				System.out.println("After wait");
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
