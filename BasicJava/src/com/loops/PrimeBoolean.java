package com.loops;

import java.util.Scanner;
public class PrimeBoolean {
	
	public static void main(String[]args)
	{
		// no is a prime no or not with boolean
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean isprime= true;
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime==true)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
