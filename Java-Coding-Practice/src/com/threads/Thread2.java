package com.threads;

public class Thread2 extends Thread{

	
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println(i);
		}
	}
	
}
