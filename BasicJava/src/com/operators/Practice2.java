package com.operators;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		float totalBill;
		float discBill;
		float discount;
		
		System.out.println("Enter your total bill:");
		totalBill= sc.nextFloat();
		
		if(totalBill>10000)
		{
			discBill= totalBill-(0.4f*totalBill);
			discount=40;
		}
		else if (totalBill>5000)
		{
			discBill= totalBill-(0.3f* totalBill);
			discount=30;
		}
		else if(totalBill>2000)
		{
			discBill= totalBill- (0.2f* totalBill);
			discount=20;
		}
		else
		{
			discBill=totalBill-(0.1f * totalBill);
			discount=10;
		}
		
		System.out.println("Total Bill: " + totalBill);
		System.out.println("After Discount: " + discBill);
		System.out.println("discount: "+ discount);
	}

}
