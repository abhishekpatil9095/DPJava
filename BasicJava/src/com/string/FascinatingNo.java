package com.string;

import java.util.Scanner;

public class FascinatingNo {
	
	public void calculate(int s)
	{
		int product1=s*1;
		int product2=s*2;
		int product3=s*3;
		
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		
		String concatNum= product1+""+product2+""+product3;
		System.out.println(concatNum);
		boolean isCheck=false;
		for(int i=0;i<=9;i++)
		{
			int count=0;
			for(int j=0;j<concatNum.length();j++)
			{
				if(Character.getNumericValue(concatNum.charAt(j))==i)
				{
					count++;
				}
				
			}
			if(count>1)
			{
				isCheck=true;
				break;
			}
			
		}
		if(isCheck==false)
		{
			System.out.println("number is fascinating");
		}
		else
		{
			System.out.println("number is not a fascinating");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 3 digit number");
		int s=sc.nextInt();
		
		FascinatingNo f= new FascinatingNo();
		f.calculate(s);
		
	}
}
