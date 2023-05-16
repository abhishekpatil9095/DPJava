package com.assignment;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a car number");
		int num= sc.nextInt();
		int copy=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			int digit= num%10;
			sum=sum+digit;
			count++;
			num=num/10;
		}
		if(count==4)
		{
			if(sum%3==0||sum%5==0||sum%7==0)
			{
				System.out.println("Lucky number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
		}
		else 
		{
			System.out.println("not a valid car number");
		}
	}
}
