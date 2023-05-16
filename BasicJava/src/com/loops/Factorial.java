package com.loops;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		
		while(num>0)
		{
			for(int i=num;i>=1;i--)
			{
			fact= fact*i;
			}
			num=num/10;
		}
		System.out.println(fact);
	}

}
