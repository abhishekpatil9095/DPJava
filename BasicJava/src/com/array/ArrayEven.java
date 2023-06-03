package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEven {

	public static void even(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				System.out.println(arr[i]);
			}
		}
		System.out.println("sum= "+sum);
	}
	
	public static void main(String[] args) {
		// find even elements from array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array elements");
		
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ArrayEven.even(a);
		
	}
}
