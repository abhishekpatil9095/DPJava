package com.operators;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter mall name:");
		String mall= sc.next();
		
		System.out.println("Enter you Total bill");
		float bill= sc.nextInt();
		float discBill;
		float discount;
		if(bill>5000)
		{
			System.out.println("You are a PV user (y/n)");
			char ch= sc.next().charAt(0);
			if(ch=='y' || ch=='Y' )
			{
				discBill= bill-(0.3f * bill);
				discount=30;
			}
			else 
			{
				discBill= bill-(0.2f * bill);
				discount=20;
			}
		}
		else
		{
			discBill=bill;
			discount=0;
		}
		
		System.out.println("======================================");
		System.out.println("Total Bill: "+ bill);
		System.out.println("Total discount discount: "+ discount);
		System.out.println("Amount to pay: "+ discBill);
	}

}
