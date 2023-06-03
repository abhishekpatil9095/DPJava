package com.inheritance;
class Employee{
	public void salary() {
		System.out.println("salary");
	}
}
class Developer extends Employee{
	public void Salary() {
		System.out.println("salary + Skilled bonus");
	}
}

public class SingleExample1 {

	public static void main(String[] args) {
		Developer d= new Developer();
		d.salary();
		d.Salary();
	}
}
