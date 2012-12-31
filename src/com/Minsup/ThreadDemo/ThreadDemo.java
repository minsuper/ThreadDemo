package com.Minsup.ThreadDemo;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonStorage CS = new CommonStorage();
		
		Thread1 t1 = new Thread1(CS);
		
		try {
			t1.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
			System.out.println("Timer ended");
			synchronized (t1) {
				t1.TimerExpired();
				t1.notify();
				System.out.println("notify() called");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
