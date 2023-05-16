package com.Test;

import java.util.Scanner;

public class Que15 {

	//	1!+2!+3!+4!...n WAP java program to find sum.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto find factorial sum");
		int n= sc.nextInt();
		int fact=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			fact= fact*i;
			System.out.print(fact+" ");
			sum=sum+fact;
		}
		System.out.println();
		System.out.println("sum= "+sum);

	}
}
