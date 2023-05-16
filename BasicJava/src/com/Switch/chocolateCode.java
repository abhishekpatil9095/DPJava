package com.Switch;

import java.util.Scanner;

public class chocolateCode {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How much money you have");
		int rs= sc.nextInt();
		int wrapper=0;
		for(int i=1;i<=rs;i++) {
			wrapper++;
			if(wrapper%3==0)
			{
				wrapper++;
			}
			
		}
		System.out.println("the kid has "+wrapper+" chocolate");
	}

}
