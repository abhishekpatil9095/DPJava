package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOdd {
	
	public static void odd(int b[])
	{
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0)
			{
				sum=sum+b[i];
				System.out.println(b[i]);
			}
		}
		System.out.println("sum= "+sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a array elements");
		
		int b[]= new int[5];
		for(int i=0;i<b.length;i++)		//for getting input from user
		{
			b[i]= sc.nextInt();
		}
		System.out.println("Array= "+Arrays.toString(b));
		ArrayOdd.odd(b);
	}

}
