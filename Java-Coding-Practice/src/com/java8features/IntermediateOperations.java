package com.java8features;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		
		List<String> names = List.of("R","A","J","Ram");
		
		System.out.println("Applying map()");
		//map() uses function functional interface
		names.stream().map(name->name.toLowerCase()).forEach(System.out::println);
		
		System.out.println("\nApplying sorted()");
		//sorted()
		names.stream().sorted().forEach(System.out::print);
		
		System.out.println("\n\ndistinct()");
		List<Integer> numbers = List.of(10,20,50,20,30,40,90);
		numbers.stream().distinct().forEach(System.out::println);

		System.out.println("\nlimit()");
		numbers.stream().limit(4).forEach(System.out::println);
		
		
	}

}
