package com.assignment12May;

public class Que1 {
//Write Employee Class with attributes like employee_id, name, and salary. Create parameterized constructor to 
//initialize this 3 attributes, and write a method to display this information of 5 objects, display 
//total no of employees using static method, totalEmp(), which will return total no of employees.

	int employee_id;
	String name;
	double salary;
	static int totalEmployees=0;
	
	public Que1(int employee_id, String name, double salary)
	{
		this.employee_id=employee_id;
		this.name=name;
		this.salary=salary;
		totalEmployees++;
	}
	
	public void display()
	{
		System.out.println("Employee id= "+employee_id);
		System.out.println("name= "+name);
		System.out.println("salary= "+salary);
		System.out.println();

	}
	public static int totalEmp()
	{
		return totalEmployees;
	}
	public static void main(String[] args) {
		Que1 q= new Que1(101,"Abhishek",1000);
		Que1 r= new Que1(202,"vijay",2000);
		Que1 s= new Que1(303,"Rushikesh",3000);
		Que1 t= new Que1(404,"Amey",4000);
		Que1 u= new Que1(505,"Naveen",5000);
		
		q.display();
		r.display();
		s.display();
		t.display();
		u.display();
		
		System.out.println(Que1.totalEmp());
		
	}
}
