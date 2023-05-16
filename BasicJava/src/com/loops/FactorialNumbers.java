package com.loops;
import java.util.Scanner;
public class FactorialNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int fact=1;
		int i=1;

		while(num>0)
		{
			int digit= num%10;
			for(i=1;i<=digit;i++)
			{
				fact= fact*i;
			}
			num=num/10;
		}
		System.out.println(fact);
		
	}

}
