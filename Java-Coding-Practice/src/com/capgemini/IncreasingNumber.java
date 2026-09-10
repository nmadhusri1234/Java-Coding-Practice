package com.capgemini;

public class IncreasingNumber {
	
	public static boolean increasingNumber(int n)
	{
		while(n>=10)
		{
			int ld = n%10;
			n=n/10;
			int pd = n%10;
			if(pd>ld)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		int n = 134468;
		
		System.out.println(increasingNumber(n));
		

	}

}
