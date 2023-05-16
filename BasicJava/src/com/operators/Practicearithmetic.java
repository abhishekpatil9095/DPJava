package com.operators;

public class Practicearithmetic {
	
	public static void main(String[] args) {
		
		int a=3;
		int b=3;
		System.out.println("value of a = "+ a +" value of b = "+b);
	
		int x=++a + ++b;
		System.out.println("x=++a + ++b = "+ x);
		System.out.println("updated value of a = "+a +" updated value of b = "+ b);
		
		x=--a - b++;
		System.out.println("x=--a - b++ = "+x);
		System.out.println("updated value of a = "+a +" updated value of b = "+ b);
		
		x=a++ + ++b -a;
		System.out.println("x=a++ + ++b -a = "+x);
		System.out.println("updated value of a = "+a +" updated value of b = "+ b);
	}

}
