package com.capgemini;

public class SumOfSquaresandSquareOfSum {

	static int sumOfSquaresandSquareOfSum(int n)
	{
		int sumofsq=0,sum=0,sumsq=0;
		for(int i=1;i<=n;i++)
		{
			 sumofsq+=(i*i);
			 sum+=i;
			// sumsq=(sum*sum); 
			
		}
		sumsq=(sum*sum);
		return sumofsq-sumsq;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println(sumOfSquaresandSquareOfSum(n));
		

	}

}
