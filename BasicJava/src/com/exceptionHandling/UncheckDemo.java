package com.exceptionHandling;

public class UncheckDemo {

	public static void main(String[] args) {
		System.out.println("hiii");
		try
		{
		int x=10/0;				// arithmetic exception come at this line 
		System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e); 	//to print what is a exception is coming
		}
		System.out.println("end");
	}
}
