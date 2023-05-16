package com.lab;

public class BookInfo {
	
	public static void main(String[] args) {
		
		BookGetterSetter b= new BookGetterSetter();
		b.setId(101);
		b.setName("Life Goal");
		b.setPrice(250);
		
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}

}
