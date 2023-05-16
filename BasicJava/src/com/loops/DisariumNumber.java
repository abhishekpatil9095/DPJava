package com.loops;

import java.util.Scanner;

public class DisariumNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//disarium= 89= 8^1 + 9^2
		//			89=89
		
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int copy= num;
		int count=0;
		int sum=0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=copy;
		while(num>0)
		{
			int digit= num%10;
			int power=1;
			for(int i=1;i<=count;i++)			
			{
				power= power*digit;
			}
			sum= sum+power;
			count--;
			num=num/10;
		}
		num=copy;
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("number is disarium");
		}
		else
		{
			System.out.println("number is not disarium");
		}
	}

}
