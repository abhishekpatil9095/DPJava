package com.operators;

import java.util.Scanner;

public class CheckChar {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the character");
		char ch= sc.next().charAt(0);
		
		if(ch>='0' && ch<='9')
		{
			System.out.println("you type digit");
		}
		else if(ch>='a'&& ch<='z')
		{
			System.out.println("you type alphabet");
		}
		else if(ch>='A'&& ch<='Z')
		{
			System.out.println("you type alphabet");
		}
		else 
		{
			System.out.println("you type Spl character");
		}
		
	}

}
