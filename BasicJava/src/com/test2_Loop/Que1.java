package com.test2_Loop;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		// WAP to accept mobile number and count frequency of digit
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a mobile number");
		long mobileNum = sc.nextLong();
		long copy=mobileNum;
		int count=0;
		while (mobileNum>0)
		{
			long digit= mobileNum%10;
			count++;
			mobileNum= mobileNum/10;
			
		}
		mobileNum=copy;
		if(count==10)
		{
			System.out.println("Mobile number accepted");
		}
		else
		{
			System.out.println("Please enter valid mobile number");
		}
	}

}
