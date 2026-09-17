package com.java8features;

interface Greeting{
	void greet(String message);
}
public class Main {
	public static void main(String[] args) {
		
		Greeting greeting = (name)->System.out.println("Hello "+name);
		greeting.greet("madhu");
	}
}
