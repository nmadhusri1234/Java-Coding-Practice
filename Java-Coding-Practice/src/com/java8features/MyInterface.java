package com.java8features;

 interface MyInterfacee {

	public void abstractMethod();
	
	public default void defaultMethod() {
		System.out.println("Default method");
	}
	
	public static void staticMethod() {
		System.out.println("Static method");
	}
}
public class MyInterface implements MyInterfacee
{
	public void abstractMethod()
	{
		System.out.println("Abstract Method");
	}
	public void defaultMethod() {
		System.out.println("Default method of child class");
	}
	
	public static void main(String[] args) {
		MyInterface mi = new MyInterface();
		
		MyInterfacee.staticMethod();
		
		mi.defaultMethod();
		mi.abstractMethod();
		MyInterfacee.staticMethod();
		
	}
}
