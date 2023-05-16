package com.test2_Loop;

import java.util.Scanner;

public class Que3 {
	//kaprekar number
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int num1 = num * num;
		int copy =num1;
		int sum = 0;

		while (num1 > 0) 
		{
			int digit = num1 % 100;
			sum = sum + digit;
			num1 = num1 / 100;
		}
		num1=copy;
		System.out.println("square= "+num1);
		System.out.println(sum+" "+num);

		if (sum == num) 
		{
			System.out.println("number is a Kaprekar");
		}
		else 
		{
			System.out.println("Not Kaprekar");
		}
	}
}
