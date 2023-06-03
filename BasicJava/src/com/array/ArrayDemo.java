package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int arr[]= {7,6,5,6,2,1};	//array declaration and initialization
		int a[]= new int[6];		//for fix or declare the size of array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a);		//when we call only "a" it shows hashcode
		System.out.println("================================================");
		
		System.out.println(Arrays.toString(a));	// For display array by using tostring method
		System.out.println("=================================================");
		
		for(int i=0;i<a.length;i++)	//Normal way to display array by using for loop
		{
			System.out.println(a[i]);
		}
		System.out.println("==================================================");
		
		for(int x:a)		//Inhance for loop for display a array
		{
			System.out.println(x);
		}
	}
}
