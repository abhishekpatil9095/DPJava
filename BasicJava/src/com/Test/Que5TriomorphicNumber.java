package com.Test;

import java.util.Scanner;

public class Que5TriomorphicNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int copy=num;
		int cube= num*num*num;
		int count=0;
		int power=1;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		for(int i=1;i<=count;i++)
		{
			power= power*10;
		}
			int digit=cube%power;
			
			if(digit==copy)
			{
				System.out.println("number is triomorphic number");
			}
			else
			{
				System.out.println("number is not triomorphic number");
			}
			
		}
		
	

}
