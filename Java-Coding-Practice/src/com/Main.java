package com;

 abstract class Employe {

	int id;
	String name;
	float baseSalary=1000;
	
	abstract float calculateSalary();
	
}

class Developer extends Employe
{
	float projectAllowance;
	Developer(float projectAllowance)
	{
		this.projectAllowance = projectAllowance;
	}
	
	@Override
	float calculateSalary() 
	{
		return baseSalary+projectAllowance;
	}

	
}
class SalesExecutive extends Employe
{

	float commission;
	@Override
	float calculateSalary() {
		return baseSalary+commission;
	}
	
}
public class Main
{
	public static void main(String[] args) {
		
		Employe e1 = new Developer(3000);
		System.out.println(e1.calculateSalary());
		
		
		
		
	}
}
