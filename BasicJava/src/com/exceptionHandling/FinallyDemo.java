package com.exceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("hiii");
		}
	}
}
