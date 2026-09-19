package com.java8features;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		//step1: create a collection
		List<String> names = List.of("R","A","J","Ram");
		
		//step2: create a stream from the collection
		Stream<String> stream = names.stream();
		
		//step3: apply intermediate operations
		//filter internally uses predicate method.it takes method as argument
		stream = stream.filter(n->n.startsWith("R")); //lazy loading
		
		//step4: Apply a terminal operation
		//forEach internally uses consumer.
		stream.forEach(name->System.out.println(name)); //eager loading
		
		//the above 3 steps can be written in a single statement
		names.stream().filter(n->n.startsWith("R")).forEach(name->System.out.println(name));
		
	}

}
