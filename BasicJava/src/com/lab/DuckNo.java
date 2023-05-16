package com.lab;

import java.util.Scanner;

public class DuckNo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		int count=0;
		int a=0;
		while(num>0)
		{
			int digit=num%10;
			a=digit;
			if(digit==0)
			{
				count++;
			}
			else if(count==1)
			{
				System.out.println("duck no");
			}
//			else if(digit==0)
//			{
//				System.out.println("duck");
//			}
			num= num/10;
			
		}
		if(a==0)
		{
			System.out.println("NOt duck");
		}
		
	}

}
