package com.loops;

public class StarPattern2E {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if
				(
				(i==2 && j==2)||(i==2 &&j==3) || (i==2&&j==4) ||(i==2&&j==5)||
				(i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)||(i==4&&j==5)
				)
					//use any condition above or below
					//if((i==2&&j>2)||(i==4&&j>4))
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
