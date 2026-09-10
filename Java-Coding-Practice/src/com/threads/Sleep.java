package com.threads;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			Thread.sleep(1000);
			
		}
	}

}
