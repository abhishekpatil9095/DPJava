package com.Test;

public class Que8 {
	public static void main(String[] args) {
		
		//12345
		// 1234
		//  123 
		//   12
		//    1
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(k);
			}
		System.out.println();
	}
	}

}
