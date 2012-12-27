package com.Minsup.ThreadDemo;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonStorage CS = new CommonStorage();
		
		Thread t1 = new Thread1(CS);
		Thread t2 = new Thread1(CS);
		
		try {
			t1.start();
			t2.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
