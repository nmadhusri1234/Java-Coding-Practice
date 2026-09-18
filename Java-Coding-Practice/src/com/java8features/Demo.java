package com.java8features;

import java.util.function.Consumer;

public class Demo {
	
	public static void printMessage(String str)
	{
		System.out.println(str);
	}
	public void print(String msg)
	{
		System.out.println("Message from instance method "+msg);
	}
	//:: used for method references

	public static void main(String[] args) {
		
//		Consumer<String> c = (str)->System.out.print("My Institute is: "+str);
//		c.accept("Codegnan");
		//Consumer<String> c = s->Demo.printMessage(s);
		//c.accept("codegnan");
		
		Consumer<String> c = Demo::printMessage;//static method reference
		c.accept("codegnan");
		
		Demo demo = new Demo();
		Consumer<String> c1 = demo::print; //instance method reference
		
		
		
	}

}

