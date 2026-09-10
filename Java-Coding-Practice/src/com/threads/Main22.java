package com.threads;

public class Main22 {

	public static void main(String[] args) {
		
		PrintingUsingRunnable p = new PrintingUsingRunnable();
		Thread t = new Thread(p);
		t.start();
		
	}

}
