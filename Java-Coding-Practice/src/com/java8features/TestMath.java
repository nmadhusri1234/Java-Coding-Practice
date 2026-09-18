package com.java8features;

public class TestMath {
	
	//if we need a 4 digit number :
	//it starts with 1000 and ends at 9999
	//so our range is 1000 to 9999
	//Math.random() generates the random value beyween 0.0 and 1.0
	//when we multiply this value with 9000 the range becomes 0.0 to lss then 9000.0
	//after typecasting to int 0 to 8999
	//we get the value before the decimal i.e 0
	
	//so we add 1000 to thevalue

	public static void main(String[] args) {
		
		//*9000 gives 4 digits
		//casting to integer gives 0
		//add 1000 and also braces.
		System.out.println((int)(Math.random()*9000)+1000);

	}

}
