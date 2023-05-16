package com.assignment;

import java.util.Scanner;

public class Que5 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		
		while(num!=0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.print(i+" ");
				}
				if(num==0)
				{
					System.out.println("No factor");
				}
			}
			break;
		}
	}

}
