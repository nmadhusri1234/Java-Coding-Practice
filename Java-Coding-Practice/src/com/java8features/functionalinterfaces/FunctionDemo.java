package com.java8features.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Student student = new Student(1,"John",65);
		
		Function<Student,String> getName = (s)->s.name;
		System.out.println("Student name: "+getName.apply(student));
		
		Function<Integer,Integer> findSquare = i->i*i;
		System.out.println("15 Square: "+findSquare.apply(15));
		System.out.println("25 square: "+findSquare.apply(25));
		
		Function<Integer,Integer> findCube = i->i*i*i;
		System.out.println("5 cube: "+findCube.apply(5));
		
//		   @param t the first function argument
//	     * @param u the second function argument
//	     * @return the function result
		BiFunction<Student,Integer,Integer> finalMarks = (student1,bonus)->student1.marks+bonus;
		System.out.println("Final Marks are:"+finalMarks.apply(student, 10));
	}

}
