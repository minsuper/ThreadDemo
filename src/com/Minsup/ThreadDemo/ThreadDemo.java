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
		try {
			t1.join();
			t2.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		X x = new X();
		Thread2 t[] = new Thread2[10];
		for(int i=0; i<10; i++) {
			t[i] = new Thread2(x);
			t[i].start();
		}
		for(int i=0; i<10; i++) {
			try {
				t[i].join();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done");
		
	}

}
