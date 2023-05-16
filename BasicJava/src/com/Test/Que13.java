package com.Test;

public class Que13 {
	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==2)
				{
				   break;
				}
				j++;
			}
			System.out.println(i);
		}

	}

}
