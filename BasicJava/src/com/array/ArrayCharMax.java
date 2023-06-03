package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCharMax {

	// find max elements from array
	
	public void findMax(char ch[])
	{
//			for(char c:ch)		// for showing ASCII value of ever character.
//			{
//				System.out.println(c+" "+(int) c);
//			}
			char max= ch[0];
			for(int j=0;j<ch.length;j++)
			{
				if(max<ch[j])
				{
				max=ch[j];
				}
			}
			System.out.println("max= "+max);
	}
	public static void main(String[] args) {
		char ch[]= new char[5];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a array elements");
		for(int i=0;i<ch.length;i++)
		{
			 ch[i]=sc.next().charAt(0);
		}
		System.out.println("given array= "+Arrays.toString(ch));
		
		ArrayCharMax v= new ArrayCharMax();
		v.findMax(ch);
	}
}
