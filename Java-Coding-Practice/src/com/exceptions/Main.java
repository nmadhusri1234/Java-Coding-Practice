package com.exceptions;

public class Main {

	public static void main(String[] args) {
		
		String status = "booked";
		
		if(status.equals("booked"))
		{
			try
			{
				//int x = 9/0;
				//throw → actually throws an exception object.
				//throws → tells the caller that a method may throw an exception.
				//throw immediately transfers control from the try block to a matching catch block
			throw new SeatAlreadyBookedException("Seat is already booked");//looks for matching catch
			//int a =0; unreachable code
			}
		
	    	catch(SeatAlreadyBookedException e)
	     	{
			System.out.println(e); //gives exceptionclassName and message
			System.out.println(e.getMessage()); //gives only message
			
		   }
		}

	}

}
