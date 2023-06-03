package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	//Print array in reverse
	public void revers(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//reverse an array
	public void reverse(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
	}
	public static void main(String[] args) {
		
		int a[]= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ArrayReverse r= new ArrayReverse();
		r.revers(a);
		
		System.out.println("===============================");
		System.out.println(Arrays.toString(a));
		r.reverse(a);
		System.out.println(Arrays.toString(a));
	}
}
