package com.method;

import java.util.Scanner;

public class Booking {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a customer name");
		String name= sc.next();
		
		System.out.println("Do you have coupan?\n if yes enter coupon code.\nelse enter 0");
		int coupan= sc.nextInt();
		
		Movie m= new Movie(101,"KGF2",300);
		//m.discount(coupan);
		System.out.println("Hello "+ name+"\n Your ticket price is= "+m.getPrice(coupan)+"\n Enjoy a movie!");
		
		
	}

}
