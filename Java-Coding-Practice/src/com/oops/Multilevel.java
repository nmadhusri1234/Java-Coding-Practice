package com.oops;

class Animal
{
	void eat()
	{
		System.out.println("Animal eats");
	}
}
class Mammal extends Animal
{
	void walk()
	{
		System.out.println("Mammal walks");
	}
}
class Dog extends Mammal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
	
}
public class Multilevel {

	public static void main(String[] args) {
		
		//Reference type  → decides what methods you can access
		//Object type     → decides which overridden method executes
		
		Animal a = new Dog();
		a.eat();
		//error a.bark(); 
		
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.bark();
	}

}
