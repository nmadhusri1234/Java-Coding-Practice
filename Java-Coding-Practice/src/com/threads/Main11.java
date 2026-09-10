package com.threads;

class Main11
{
	public static void main(String args[])
	{
		PrintNumbersThread p = new PrintNumbersThread();
		
		p.start();
	}
}
