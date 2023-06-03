package com.string;

import java.util.Scanner;

public class toggleCase {

	public void toggle(String s)
	{
		String toggled="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				toggled= toggled + (char)(s.charAt(i)-32);
			}
			else if(s.charAt(i)>'A'&& s.charAt(i)<'Z')
			{
				toggled= toggled + (char)(s.charAt(i)+32);
			}
		}
		System.out.println(toggled);
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a element");
	String s= sc.nextLine();
	
	toggleCase t= new toggleCase();
	t.toggle(s);
	
	}
}
