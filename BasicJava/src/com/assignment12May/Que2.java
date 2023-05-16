package com.assignment12May;

public class Que2 {
//	Create one class Employee (id , name, salary) with private access modifier
//	and create getter and setter.
	
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		Que2 a= new Que2();
		a.setId(11);
		a.setName("Jitendra");
		a.setSalary(5000);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getSalary());
	}

}
