package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchElement {
// search element in array
	
	public void searchElement(int a[],int num)
	{
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("element present");
		}
		else 
		{
			System.out.println("element not present");
		}
	}
	public static void main(String[] args) {
		
		int a[]= {1,5,4,7,6,9,5,3};
		System.out.println(Arrays.toString(a));
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element for search");
		int num= sc.nextInt();
		
		ArraySearchElement n= new ArraySearchElement();
		n.searchElement(a, num);
	}
}
