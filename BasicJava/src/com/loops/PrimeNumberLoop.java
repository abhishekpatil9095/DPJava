package com.loops;

public class PrimeNumberLoop {
	
	public static void main(String[] args) {
		
		// print prime number between 1 to 100
		int count=0;
		int sum=0;
		double avg;
		for(int i=1;i<=100;i++)
		{
			boolean isprime= true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) 
				{
				isprime=false;
				break;
				}
			}
			if(isprime==true) 
			{	
				count++;
				sum= sum+i;
			}
			System.out.print(i+" ");
		}
		System.out.println();
			System.out.println("sum = "+sum);
			System.out.println("count = "+count);
			avg= sum/count;
			System.out.println("avg = "+avg);
	}

}
