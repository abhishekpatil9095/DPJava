package com.operators;

import java.util.Scanner;

public class NestedIf {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your age");
		int age= sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("Enter BMI");
			float bmi= sc.nextFloat();
			if(bmi>=18 && bmi<=25)
			{
				System.out.println("You can donate blood");
			}
			else
			{
				System.out.println("You can not donate blood");
			}
		}
		else
		{
				System.out.println("You are too young");
		}
		}
	}


