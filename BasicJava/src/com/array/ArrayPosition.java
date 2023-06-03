package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPosition {

	//write a program to display even position element from array
	
	public static void position(int c[])
	{
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(c[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array elemts");
		int c[]= new int[5];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(c));
		ArrayPosition.position(c);
	}
}
