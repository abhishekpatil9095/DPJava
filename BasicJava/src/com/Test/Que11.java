package com.Test;

public class Que11 {
	
	//    Print the Series 	2 12 36 80 150 252....upto 10 terms
		public static void main(String[] args) {
			
			int n=10;
			int ans=0;
			for(int i=1;i<=n;i++)
			{
				ans = (i*i)+(i*i*i);
				System.out.print(ans+" ");
			}
			
		}

}
