package com.abstractMethod;

abstract class Device{
	abstract void electronic();
//abstract static void prize();	//we can't declare static abstract method in abstract class.
	
	public void Battery()
	{
		System.out.println("Charge electric devices");
	}
}
class Computer extends Device{
	public void electronic()
	{
		System.out.println("Need charging");
	}
	public static void prize()
	{
		System.out.println("500");
	}
	public void use()
	{
		System.out.println("Storing personal data");
	}
}

public class AbstractMultiLevel {

	public static void main(String[] args) {
		
	Computer c= new Computer();
	c.Battery();
	c.electronic();
	c.use();
	c.prize();
	}

}
