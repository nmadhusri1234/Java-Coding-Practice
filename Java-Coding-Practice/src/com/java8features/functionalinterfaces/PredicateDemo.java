package com.java8features.functionalinterfaces;

import java.util.function.*;

public class PredicateDemo {
	

	public static void main(String[] args) {
		
		Student s1 = new Student(100,"Raj",90);
		
		System.out.println(s1.test(s1));

										//s is treated as student object implementation for test method
		Predicate<Student> checkMarks = (s)->s.marks>=60;
		System.out.println(checkMarks.test(s1));
		
												//student is treated as student object passingmarks is treated as integer
		BiPredicate<Student,Integer> isPassed = (student,passingmarks)->student.marks>=passingmarks;
		System.out.println("Passed :"+isPassed.test(s1, 40));
		System.out.println("Passed :"+isPassed.test(s1, 100));
	}

}
