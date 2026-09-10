package com.threads;

public class Thread34 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		t3.start();
		t3.join();
		t4.start();

	}

}
