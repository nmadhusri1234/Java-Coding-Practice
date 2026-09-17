package com.java8features.functionalinterfaces;

public class Student {

	int id;
	String name;
	int marks;
	
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public boolean test(Student student)
	{
		return student.marks>=60;
	}
	
	
}
