package com.test2;

import java.util.Scanner;

public class XobinTest2 {

// write a program to generate first 100 terms of following series
//Accept position of number in series from user, find number in series at that position
//e.g. 	input 3	output 4
//e.g.	input 10 output 46
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int index= sc.nextInt();
		int num=1;
		
		for(int i=1;i<=100;i++)
		{
			num=num+(i-1);
			
			if(i==index)
			{
				System.out.println(num+" ");
			}
			
		}
	}
}
