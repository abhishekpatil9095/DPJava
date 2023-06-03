package com.string;

import java.util.Scanner;

public class EvenDigitSum {

	public void evensum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
			{
				if(s.charAt(i)%2==0)
				{
					sum= sum+ Character.getNumericValue(s.charAt(i));
				}
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string elements");
		String s= sc.nextLine();
		
		EvenDigitSum e= new EvenDigitSum();
		e.evensum(s);
	}
}
