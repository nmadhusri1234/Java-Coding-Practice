package com.oops;

 class Employee {

	String name ;
	public void work()
	{
		System.out.println("Employee is working");
	}
}
 
 public class Developer extends Employee
 {
	 String language;
	 public void code()
	 {
		 System.out.println("Developer is coding in Java");
	 }
	 
	 public static void main(String args[])
	 {
		 Developer d = new Developer();
		 d.name = "Madhu";
		 d.language = "Java";
		 d.work();
		 d.code();
		 
	 }
 }

