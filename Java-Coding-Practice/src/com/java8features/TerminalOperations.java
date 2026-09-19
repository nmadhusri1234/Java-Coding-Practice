package com.java8features;

import java.util.List;

public class TerminalOperations {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,30,20,60,50);
		
		//terminal operation can be used without intermediate
		//forEach performs an action on every element of the stream.
		numbers.stream().forEach(n->System.out.println(n));

		//count() returns the num of elements in te stream
		long count=numbers.stream().count();
		System.out.println("\nCount is: "+count);
		
		long c = numbers.stream().filter(n->n>20).count();
		System.out.println("\nCount of elements greater than 20: "+c);
	
		//toList() collects the Stream elements into a List
		List<Integer> result = numbers.stream().filter(n->n>=30).toList();
		System.out.println("\nElements greater than 30: "+result);
		
		//reduce() - terminal operation which combines all elements of a stream and produces one final result
		int sum = numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println("\nSum is: "+sum);
		
	}
}
