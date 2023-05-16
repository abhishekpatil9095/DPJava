package com.loops;

import java.util.Scanner;

public class KrushnamurthyNumber {
	
	public static void main(String[] args) 
	{
		// krushnmurthy number 145= 1! + 4! + 5! =145
		// after the factor of every digit addition is same as given number.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int copy=num;
		int sum=0;
		while(num>0)
		{
			int digit= num%10;
			int product=1;
			for(int i=1;i<=digit;i++)
			{
			product=product*i;
			}
			sum=sum+product;
			//digit--;
			num=num/10;
		}
		num=copy;
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("number is krushnamurthy");
		}
		else
		{
			System.out.println("number is not krushnamurthy");
		}
	}
}
