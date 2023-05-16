package com.loops;

import java.util.Scanner;

public class SpyNumber {
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		int copy=num;
		int product=1;
		int digit;
		int sum=0;
		while(num>0)
		{
			 digit= num%10;
			 product = product*digit;
			 sum=sum + digit;
			 num=num/10;
		}
		num=copy;
		if(product==sum)
		{
			System.out.println("number is a spy number");
		}
		else
		{
			System.out.println("number is not a spy number");
		}
		System.out.println("product = "+product);
		System.out.println("sum = "+sum);
		
		
	}

}
