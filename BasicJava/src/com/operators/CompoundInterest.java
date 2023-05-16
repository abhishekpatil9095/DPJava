package com.operators;

import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a principle amount");
		float principle = sc.nextFloat();
		
		System.out.println("enter a rate of interest");
		float rate= sc.nextFloat();
		
		System.out.println("enter a time in year");
		float time= sc.nextFloat();
		
		System.out.println("enter a no of times compound interest in a year");
		int noOfTimes = sc.nextInt();
		
		float amount = (principle)*(1+(rate/noOfTimes))*(noOfTimes*time);
		System.out.println("amount = "+amount);
		
		float CompoundInterest= amount-principle;
		System.out.println("Compound Interest = "+ CompoundInterest);
	}

}
