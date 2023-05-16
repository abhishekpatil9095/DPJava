package com.polymorphism;

public class StaticMethodOverload {
	
	public static void demo()
	{
		System.out.println("method 1");
	}
	public static void demo(int x)
	{
		System.out.println("method 2");
	}
	
	public static void demo(char c)
	{
		System.out.println("method 3");
	}
	
	public static void main(String[] args) {
		demo();
		demo(20);
		demo('a');
		main(30);
	}
	public static void main(int d)
	{
		System.out.println("main");
	}

}
