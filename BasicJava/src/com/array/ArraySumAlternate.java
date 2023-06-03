package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAlternate {

	// Write a code to perform sum of alternate elemnts from array
	public static void sumAlternate(int d[])
	{
		int sum=0;
		for(int i=0;i<d.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+d[i];
			}
		}
		System.out.println("sum of alternate no= "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a array elements");
		int d[]=new int[5];
		
		for(int i=0;i<d.length;i++)
		{
			d[i]=sc.nextInt();			
		}
		System.out.println(Arrays.toString(d));
		ArraySumAlternate.sumAlternate(d);
		}
}
