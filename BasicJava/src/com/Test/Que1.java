package com.Test;

public class Que1 {

	public static void main(String[] args) {
		// write a program 1 to 100 except which are divisible 5 or 10
		
		for(int i=1;i<=100;i++)
		{
			if(i%5!=0 && i%10!=0)
			{
				System.out.println(i);
			}
		}
	}
}
