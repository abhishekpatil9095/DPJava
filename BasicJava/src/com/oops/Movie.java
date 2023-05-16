package com.oops;

import java.util.Scanner;

public class Movie {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		char ch;
		do {
	
		System.out.println("enter a amount of pizza");
		int pizza= sc.nextInt();
		System.out.println("enter a amount of puffs");
		int puffs= sc.nextInt();
		System.out.println("enter a amount cooldrink");
		int cooldrink= sc.nextInt();
		
		int pizzaprice =100;
		int puffsprice=20;
		int cooldrinkprice=10;
		
		int totalbill= (pizza*pizzaprice)+(puffs*puffsprice)+(cooldrink*cooldrinkprice);
		
		System.out.println("No. of pizzas= "+ pizza);
		System.out.println("No of puffs= "+ puffs);
		System.out.println("No of cooldrink= "+cooldrink);
		System.out.println("Total price= "+totalbill);
		System.out.println("You want more");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	
	}
}
