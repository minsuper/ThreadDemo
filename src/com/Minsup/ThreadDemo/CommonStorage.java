package com.Minsup.ThreadDemo;

public class CommonStorage {
	private int n=0;
	
	public int getData() {
		return n;
	}
	
	synchronized void increaseN() {
		n += 10;
	}
}
