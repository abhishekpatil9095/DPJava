package com.string;

import java.util.Scanner;

public class AddDigitFirstLast {

	public boolean CheckChar(String s)
	{
		int count=0;
		boolean isCheck=true;
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)>='a')&&(s.charAt(i)<='z')||(s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
		{
			count++;
		}
		}
		if(count>=1)
		{
			System.out.println("please enter only digit");
			isCheck=false;
		}
		return isCheck;
	}
	public void sum(String s) {
		if(this.CheckChar(s))
		{
		int sumfirst = 0;
		int sumlast = 0;
		if (s.length() >= 3) 
		{
			char ch[] = s.toCharArray();
			for (int j = 0; j <= 2; j++)
			{
				sumfirst = sumfirst + Character.getNumericValue(ch[j]);
			}
			for (int k = s.length() - 3; k < s.length(); k++) 
			{
				sumlast = sumlast + Character.getNumericValue(ch[k]);
			}
			System.out.println("sum first 3 digit= " + sumfirst);
			System.out.println("sum last 3digit= " + sumlast);
			if (sumfirst == sumlast) 
			{
				System.out.println("number is valid");
			} 
			else 
			{
				System.out.println("Invalid number");
			}
		} 
		else
		{
			System.out.println("You enter less than 3 digit or character type data");
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string elements digit");
		String s = sc.nextLine();

		AddDigitFirstLast a = new AddDigitFirstLast();
		a.sum(s);
	}
}
