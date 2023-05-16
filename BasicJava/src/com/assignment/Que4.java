package com.assignment;

import java.util.Scanner;

public class Que4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		long num= sc.nextLong();
		
		System.out.println("enter a digit that how many time appears");
		int key= sc.nextInt();
		
		int count=0;
		while(num>0)
		{
			long digit= num%10;
			count++;
			num=num/10;
		}
		System.out.println("the key digit appears in "+count+" times");
	}

}
