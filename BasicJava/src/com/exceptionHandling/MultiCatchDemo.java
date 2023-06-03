package com.exceptionHandling;

public class MultiCatchDemo {

	public static void main(String[] args) {
		//	you can write multiple catch blocks but only one catch block execute.
		// Also you can write nested try blocks in it.
		//	When you type any try block then it is compulsary to write catch or finally block.
		try {
		int a[]=null;
		System.out.println(a[5]/0);
		}
		catch(IndexOutOfBoundsException i)
		{
			System.out.println(i);	//it shows which type of exception is occured
		}
		catch(ArithmeticException a)
		{
			a.getMessage();			// it shows where the condition is false.
		}
		catch(Exception e)
		{
			e.printStackTrace();	//it shows hierarchy of exception or error
		}
	}
}
