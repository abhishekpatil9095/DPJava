package com.assignment12May;

public class Que4 {
//	Create a class 'Student' with three data members which are name, age and
//	address. It has two methods with the same name set_Info(). First method
//	has two parameters for name and age and assigns the same whereas the
//	second method takes has three parameters which are assigned to name,
//	age and address respectively. Print the name, age and address.

	private String name;
	private int age;
	private String address;
	
	public void set_Info(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void set_Info(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void Info()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}
	public static void main(String[] args) {
		Que4 b= new Que4();
		b.set_Info("abhi", 19);
		b.set_Info("Abhishek", 24, "Satara");
		b.Info();
	}
}
