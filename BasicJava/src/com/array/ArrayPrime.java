package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrime {

	//write a code to calculate avg. of prime numbers from array
	
	public static void primeAvg(int x[])
	{
		int sum=0;
		float avg=0;
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			boolean isprime=true;
			int a=x[i];
			for(int j=2;j<a;j++)
			{
				if(a%j==0)
				{
					isprime=false;
					break;
				}			
			}
			if(isprime)
			{
				sum=sum+x[i];
				count++;
			}
			avg=sum/count;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array elements");
		int x[]=new int[5];
		
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		ArrayPrime.primeAvg(x);
	}
}
