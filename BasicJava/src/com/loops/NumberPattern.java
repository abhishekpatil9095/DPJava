package com.loops;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		//1
		//23
		//456
		//78910
		int i;
		int j;
		int z=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(z);
				z++;
				
			}
			System.out.println();
			
		}
	}

}
