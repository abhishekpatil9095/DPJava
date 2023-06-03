package com.string;

import java.util.Scanner;

public class StringPattern {

	public void display(String s)
	{
		String st[]= s.split(" ");
		for(int i=1;i<=st.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(st[j] +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a string elements");
		String s= sc.nextLine();
		
		StringPattern p= new StringPattern();
		p.display(s);
		
	}
}
