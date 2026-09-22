package com.java8features.functionalinterfaces;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> add10 = n->n+10;
		
		Function<Integer,Integer> multiply2 = n->n*2;
		
		//applying function chaining using andThen() and compose()
		//using andThen()-->left to right
		
		Function<Integer,Integer> result = add10.andThen(multiply2);
		System.out.println(result.apply(10));
		
		//using compose()-->right to left
		Function<Integer,Integer> res = add10.compose(multiply2);
		System.out.println(res.apply(10));
	}

}
