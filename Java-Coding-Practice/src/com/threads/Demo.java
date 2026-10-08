package com.threads;

public class Demo {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setPriority(1);
		System.out.println(t);
		
		
	}

}
