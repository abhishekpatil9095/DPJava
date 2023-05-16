package com.test2_Loop;

public class Que4 {
	//1
	//21
	//321
	//4321
	//54321
//	public static void main(String[] args) {
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=i;j>=1;j--)
//		{
//			System.out.print(j);
//		}
//		System.out.println();
//		
//	}
//	}
	
	//    1
	//   10
	//  101
	// 1010
	//10101
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2!=0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
		System.out.println();
		}
	}
}
