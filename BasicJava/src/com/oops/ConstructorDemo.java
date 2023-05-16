package com.oops;

public class ConstructorDemo {
	
	int id;
	String name;
	public ConstructorDemo()	//constructor without parameter
	{
		id=2;
	}
	
	public void display()		//method to display output
	{
		System.out.println(id);
		System.out.println(id+" "+name);
	}
	
	public ConstructorDemo(int eid,String ename)	//constructor with argument
	{
		id= eid;
		name=ename;
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo c= new ConstructorDemo(102,"Abhi");	//object creation of constructor 
		c.display();	//calling method for printing the output
		
	}

}
