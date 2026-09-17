package com.java8features;

@FunctionalInterface
 interface Message {

	void display();

}
public class MessageImpl 
{
	
	public static void main(String[] args) {
		
		//lamba expressions can be used only with functional interfaces
		Message message = ()->System.out.println("Displaying message");
		
		message.display();
	}
}
