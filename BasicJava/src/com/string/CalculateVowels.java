package com.string;

import java.util.Scanner;

public class CalculateVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string elements");
		
		String s= sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')
				||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
