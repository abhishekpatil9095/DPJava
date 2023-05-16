package com.assignment;

import java.util.Scanner;

public class Que3 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a standard of nila");
		int standard= sc.nextInt();
		
		int sqr=0;
		int pencil=0;
		
		if(standard!=0&&standard<12)
		{
			for(int i=1;i<=standard-1;i++)
			{
				sqr=i*i;
				pencil=pencil+sqr;
			}
			System.out.println("nila gets "+pencil+" pencil");
		}
		else
		{
			System.out.println("invalid standard");
		}
	}

}
