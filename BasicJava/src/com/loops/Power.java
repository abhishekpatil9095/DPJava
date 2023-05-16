package com.loops;

import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a base");
		int base = sc.nextInt();
		
		System.out.println("enter a exponent");
		int expo= sc.nextInt();
		int power=1;
		int i=1;
			
		while(i<=expo)
		{
			power = power*base;
			i++;
		}
		System.out.println(power);
	}
}
