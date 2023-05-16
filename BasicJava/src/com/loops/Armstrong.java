package com.loops;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		int num1=num;
		int sum=0;
		
		while(num>0)
		{
			int digit= num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println(sum);
		num=num1;
	
		if(sum==num)
		{
		System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		
	}

}
