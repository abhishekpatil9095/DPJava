package com.basics;

import java.util.Scanner;

public class ScannerDemo1 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first num: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("enter second num: ");
		
		int num2 = sc.nextInt();
		
		System.out.println("enter third num: ");
		
		int num3 = sc.nextInt();
		
		int result = (num1 + num2 + num3)/3;
		
		System.out.println("result = "+ result);
	}

}
