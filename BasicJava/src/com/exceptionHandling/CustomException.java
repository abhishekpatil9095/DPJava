package com.exceptionHandling;

	// Custom Exception
class NegativeIndexException extends Exception{	
	// Same criteria to write multiple exception in diff inner classes
	public NegativeIndexException()
	{
		System.out.println("-ve number not allowed");
	}
	public NegativeIndexException(String msg)
	{
		super(msg);
	}
}

public class CustomException {

	public void Check(int base, int expo) throws NegativeIndexException
	{	//When you declare throw keyword exception but not initialize with try & catch block.
		//Then Throws keyword is compulsary to declare.
		int power=1;
		if(expo<0)
		{
			throw new NegativeIndexException();
		}
		else
		{
			for(int i=1;i<=expo;i++)
			{
				power=power*base;
			}
			System.out.println(power);
		}
	}
	public static void main(String[] args) {
		CustomException c= new CustomException();
		//When you declare throws keyword in method then you need to use try and catch block in main method.
		try {
			c.Check(2, -3);
		} catch (NegativeIndexException n) {	//you need to write Same exception as Throws keyword or Parent of Exception.			
			n.printStackTrace();
		}
		System.out.println("done...");
	}
}
