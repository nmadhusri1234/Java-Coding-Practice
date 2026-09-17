package com.java8features;

@FunctionalInterface //single abstract method any num of static and default methods
public interface FInterface {

	public void method1();
	//public void method2();
	
	public static void method3() {
		System.out.println("static");
	}
	
	default void myMethod() {
		System.out.println("default method");
	}
	
}
