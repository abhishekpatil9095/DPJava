package com.assignment;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age= sc.nextInt();
		int cube=1;
		while(age>0)
		{
			cube= age*age*age;
			System.out.println("Meenu gets "+cube+" coins");
			break;
		}
		if(age<0)
		{
			System.out.println("invalid age");
		}
	}

}
