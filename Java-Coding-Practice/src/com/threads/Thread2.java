package com.threads;

public class Thread2 extends Thread{

	
	public void run()
	{
		for(int i=105;i<=115;i++)
		{
			System.out.println((char)i);
		}
	}
	
}
