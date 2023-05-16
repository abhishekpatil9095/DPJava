package com.loops;

public class NumberPattern2 {
	
	public static void main(String[] args) {
		//  1  
		// 1221
		//123321
		
		int x=1;
		
		for (int i = 1; i <= 4; i++) {
			for ( int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for ( int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i; j >= 1; j--) {
				
				if(x==1)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print(j);
				}
				x++;
			}
			System.out.println();
		}

	}

}


