package com.basics;

import java.util.Scanner;

public class IfelseDemo {
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner (System.in);

		System.out.println("enter your age:");
		
		int age= sc.nextInt();
		
		if(age>=18) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("you cannot vote");
		}
		sc.close();
		
	}

}
