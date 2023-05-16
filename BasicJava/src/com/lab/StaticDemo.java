package com.lab;

public class StaticDemo {
	
	static int x=7;
	
	public static int add(int x,int y)
	{
		return (x+y);
	}
	 public static void main(String[] args) {
		 
		 System.out.println(StaticDemo.add(x, 6));
		
	}

}
