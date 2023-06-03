package com.arrayOfObject;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		
		e[0]=new Employee(909,"Abhi",100000);
		e[1]=new Employee(808,"vijay",90000);
		e[2]=new Employee(707,"Rushi",80000);
		
		System.out.println("=====================================");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		// Find employee with salary more than 80000
		System.out.println("===============================");
		for(int j=0;j<e.length;j++)
		{
			if(e[j].salary>80000)
			{
				System.out.println(e[j]);
			}
		}
		
	}
	
}
