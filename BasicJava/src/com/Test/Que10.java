package com.Test;

import java.util.Scanner;

public class Que10 {
	
	public static void main(String[] args) {
		// twin prime number 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st number");
		int num = sc.nextInt();
		System.out.println("enter 2nd number");
		int num2= sc.nextInt();
		int i=2;
		int factor=0;
		int factor2=0;
		while((i<=num)||(i<=num2))
		{
			if(num%i==0)
			{
				factor++;
			}
			if(num2%i==0)
			{
				factor2++;
			}
			i++;
		}
			int differnce= num2-num;
		if(differnce==2 && factor==1 && factor2==1)
		{
			System.out.println("number is twin prime");
		}
		else
		{
			System.out.println("number is not twin prime");
		}
	}

}
