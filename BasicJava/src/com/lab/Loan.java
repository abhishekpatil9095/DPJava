package com.lab;

import java.util.Scanner;

public class Loan {
	
	Scanner sc= new Scanner(System.in);
	double p= sc.nextDouble();
	double r;
	int month;
	static double totalAmount=0;
	
	public void loan(int month)
	{
		this.month=month;
		r=4.5;
		this.totalAmount=p*month*r/100;
		System.out.println("total amount= "+totalAmount);
	}
	
	public void loan(int month, double p)
	{
		if(month<=6)
		{
			this.month=month;
			this.totalAmount=totalAmount;
			r=4.5;
			totalAmount=p*month*r/100;
			System.out.println("loan amount when month less than6= "+ totalAmount);
		}
		else if(month>6)
		{
			this.month=month;
			this.totalAmount=totalAmount;
			r=7.5;
			totalAmount=p*month*r/100;
			System.out.println("loan amount when month more than 6= "+ totalAmount);
		}
		 
	}

	public static void main(String[] args) {
		
		Loan l= new Loan();
		l.loan(6);
		l.loan(4, 50000);
		l.loan(12, 50000);
	}
}
