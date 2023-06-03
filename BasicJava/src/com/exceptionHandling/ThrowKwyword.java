package com.exceptionHandling;

public class ThrowKwyword {

	public static void isvalid(int age)
	{
		try
		{
		if(age<18)
		{
			//use throw keyword within a method with type of exception.
// When you want to execute exception forcefully then you use 'throw' keyword.
			throw new ArithmeticException("invalid age");
		}
		else {
			System.out.println("valid");
		}
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		isvalid(12);
		System.out.println("done");
	}
}
