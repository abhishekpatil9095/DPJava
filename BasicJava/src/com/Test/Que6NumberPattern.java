package com.Test;

public class Que6NumberPattern {
	
	public static void main(String[] args) 
	{
		//   1
		//  222
		// 33333
		//4444444
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=7;j++)
		   {
			   if((i<=3&&j==4)||(i==2&&(j>=3&&j<=5))
					   ||(i==3&&(j>=2&&j<=6))||i==4)
			   {
				   System.out.print(i);
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
	}

}
