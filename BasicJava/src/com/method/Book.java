package com.method;

import java.util.Scanner;

public class Book {
	
	int id;
	String name;
	int price;
	String a_name;
	
	public Book(int id,String name, int price, String a_name)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.a_name=a_name;
	}
	public void showBook()
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a author name");
		String s= sc.nextLine();
		int totalPrice=0;
		if(a_name.equals(s))
		{
			totalPrice= price-50;
			System.out.println("after getting bonus= "+totalPrice);
		}
		else
		{
			totalPrice=price;
			System.out.println(totalPrice);
		}
	}
	public static void main(String[] args) {
		
		Book b= new Book(101,"life goals",250,"Chetan bhagat");
		b.showBook();
	}

}
