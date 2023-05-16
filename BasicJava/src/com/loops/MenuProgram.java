package com.loops;

import java.util.Scanner;

public class MenuProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			
		System.out.println("Enter height");
		int height = sc.nextInt();
		
		System.out.println("Enter Base");
		int base= sc.nextInt();
		
		System.out.println("Enter Radius");
		int radius= sc.nextInt();
		
		System.out.println("Enter Breadth");
		int breadth= sc.nextInt();
		
		System.out.println("Enter Length");
		int length= sc.nextInt();
		
		System.out.println("1. Area of Rectangle \n 2. Area of Triangle \n 3. Area of Circle");
		
		int choice= sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Area of Rectangle= "+ (length*breadth));
		break;
		
		case 2: System.out.println("Area of Triangle= "+(height*base/2));
		break;
		
		case 3: System.out.println("Area of circle= "+(3.14*(radius*radius)));
		break;
		default:
			System.out.println("invalid choice");
		}
		System.out.println("Do you want to continue.........");
		ch= sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}

}
