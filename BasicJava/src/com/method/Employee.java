package com.method;

public class Employee {
	
	int id;
	String name;
	int salary;
	int age;
	
	public Employee(int eid,String ename,int esalary,int eage)
	{
		id=eid;
		name=ename;
		salary=esalary;
		age=eage;
	}
	
	public void getBonum()
	{
		int sum;
		int bonus=5000;
		int bonus1=2000;
		if (age>60)
		{
			System.out.println("Salary= "+salary+" bonus= "+bonus);
			System.out.println(sum=salary+bonus);
		}
		else if(age>40&&age<60)
		{
			System.out.println("Salary= "+salary+"bonus= "+bonus1);
			System.out.println(sum=salary+bonus1);
		}
		else
		{
			System.out.println("No bonus");
		}
	}
	public static void main(String []args) {
		Employee em= new Employee(24, "Abhishek",45000 , 65);
		//em.details(24, "Abhishek",45000 , 65);
		em.getBonum();
	}
	

}
