package com.threads;

public class PrintingUsingRunnable implements Runnable {

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from Thread");
		}
	}
}
