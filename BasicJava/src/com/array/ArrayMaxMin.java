package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
//	Find max and mean elements from array
	
	public static void max(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(max<a[j])
				{
					max=a[j];
				}
			}
		}
		System.out.println("max= "+max);
	}
	public static void min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(min>a[j])
				{
					min=a[j];
				}
			}
		}
		System.out.println("Min= "+min);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array elements");
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ArrayMaxMin.max(a);
		ArrayMaxMin.min(a);
	}
}
