package com.assignment12May;

public class Que3 {
//	Create a class Cycle with member variables: int accountNo, int noOfWheels
//	a. Create a default constructor with a write in it “I am default
//	constructor”
//	b. Create another constructor which takes 2 arguments, calls the default
//	constructor using this keyword and has a print in it “I am another
//	constructor”.
//	c. In main method, create an object of type Cycle by using default
//	constructor(Note the output)
//	d. Create another object of type Cycle by using the parameterized
//	constructor( Note the sequence of print indicating that inner most constructor is called first)
	
	int accountNo;
	int noOfWheels;
	
	public Que3()
	{
		System.out.println("I am default constructor");
	}
	
	public Que3(int accountNo, int noOfWheels)
	{
		this();
		System.out.println("I am another constructor");
	}
	public static void main(String[] args) {
		Que3 c= new Que3();			// output is I am default constructor
		
		Que3 d= new Que3(1231007,2);	//output is I am default constructor
										//			I am another constructor
		
	}
}
