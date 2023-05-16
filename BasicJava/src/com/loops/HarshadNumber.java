package com.loops;

import java.util.Scanner;
public class HarshadNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int copy=num;
		int digit;
		int sum=0;
		while(num>0)
		{
			digit= num%10;
			sum=sum+digit;
			num= num/10;
		}
		num=copy;
		System.out.println(sum);
		if(num%sum==0)
		{
		System.out.println("number is Harshad");
		}
		else
		{
			System.out.println("number is not Harshad");
		}
		}

}
