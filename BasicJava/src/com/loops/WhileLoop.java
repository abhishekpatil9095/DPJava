package com.loops;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int result=0;
		int num1;
	
		System.out.println("enter first number");
		 num1 = sc.nextInt();
		
		while(num1<5) {
			
		num1++;
			
		}
		 result=result+ num1;
		System.out.println(result);
	}
	
}
