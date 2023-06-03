package com.abstractMethod;

abstract class Card{
	abstract void makeCard();
	
	public void checkPrice()
	{
		System.out.println("price"+250);
	}
}

class Birthday extends Card{
	void makeCard()
	{
		System.out.println("Hi this is birthday invitation");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		
		Birthday b= new Birthday();
		b.makeCard();
		b.checkPrice();
	}

	
}
