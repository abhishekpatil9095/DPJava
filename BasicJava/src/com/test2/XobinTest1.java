package com.test2;

import java.util.Scanner;

public class XobinTest1 {

// write a program to generate numbers of following series upto given number
// if input is 200 then print below series
//1,3,7,15,31,63,127
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int ans=1;
		for(int i=1;i<=num;i=2*i+1)
		{
			System.out.println(i+" ");
		}
		
	}
}
