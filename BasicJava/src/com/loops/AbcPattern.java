package com.loops;

public class AbcPattern {
	
	public static void main(String [] args) {
		
		//DCBA
		//DCB
		//DC
		//D
	
//		for(char i='A';i<='D';i++)
//		{
//			for(char j='D';j>=i;j--)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		//ABCD
		//ABC
		//AB
		//A
		
		for(char i='D';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
}
}
