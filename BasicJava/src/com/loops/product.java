package com.loops;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int product=1;
		
		while(num>0)
		{
			int digit= num%10;
			product= product*digit;
			num=num/10;
		}
		System.out.println(product);
	}
}
