package com.basics;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = sc.next();
		
		System.out.println("Enter marks of 5 subject: ");
		
		System.out.println("english");
		 float english= sc.nextFloat();
		 
		 System.out.println("hindi");
		 float hindi = sc.nextFloat();
		 
		 System.out.println("maths");
		 float maths = sc.nextFloat();
		 
		 System.out.println("science");
		 float science= sc.nextFloat();
		 
		 System.out.println("sst");
		 float sst= sc.nextFloat();
		 
		 System.out.println("=========================");
		System.out.println("Grade card of student "+ name+ ":");
		 float percentage = (english + hindi + maths + science + sst)/500*(100);
		 
		 System.out.println("percentage = " +percentage);
		 
		if(percentage>=75) {
			System.out.println("Grade A");
		}
		else if (percentage>=60) {
			System.out.println("Grade B");
		}
		else if(percentage>=35) {
			System.out.println("grade C");
		}
		else {
			System.out.println("fail");
		}
		 sc.close();
		
	}
}
