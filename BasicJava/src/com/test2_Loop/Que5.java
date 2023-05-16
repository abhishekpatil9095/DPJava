package com.test2_Loop;

import java.util.Scanner;

public class Que5 {
	public static void main(String[] args) {
		
		//series 0,3,8,15,24,35,48,....n
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to calculate how long series");
		int n= sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			ans= i*i-1;		//logic is every num is Square-1
			System.out.print(ans+" ");
		}
	}

}
