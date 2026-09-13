package com.threads;

public class Thread12 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t1.join();
		t2.start();
	}

}
