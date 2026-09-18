package com.java8features;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = name->System.out.println("Welcome "+name);

	}

}

//Predicate<T>:
//	to test a condition with single argument
//	boolean test(T t);
//BiPredicate<T,U>:
//	to test a condiiton with two arguments
//	boolean test(T t,U u)
//Function<T,R>:
//	Take something(method argument) and return something(return type of the method).
//	R apply(T t)
//	R is the return type and T is the argument of the function
//BiFunction<T,U,R>:
//	It takes two inputs and produces a result
//	R apply(T t,U u)
//	T , u are arguments R is return type
//Consumer<T>:
//	uses or process data it takes something but returns nothing.
//	accept(T t)
//BiConsumer<T,U> :
//	It takes two arguments
//Supplier:
//	Produces / provides data, it takes nothing(no arguments passed) but returns something(method with return type)
//
//
//	predicate checks
//	function transforms
//	consumer consumes
//	supplier supplies
//	
