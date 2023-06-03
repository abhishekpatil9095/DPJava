package com.loops;

import java.util.Scanner;

public class OccuranceOfnumber {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		int num= sc.nextInt();
		int num1=num;
		
		for(int i=0; i<=9;i++) {
			int count=0;
			while(num>0)
			{
				int num2= num % 10;
				if(i==num2)
				{
					count++;
				}
				num= num/10;
				
			}
			num=num1;
			if(count>0)
			{
				System.out.println(i+ " "+ count+ "times");
			}
		}
	}
}
