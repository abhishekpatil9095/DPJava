package com.loops;

public class primeNumber {
	
	public static void main(String[] args) {
		
		int num = 89734;
		int digit;
		while(num>0)
		{
			digit= num%10;
			boolean isprime= true;
			for(int i=2;i<digit;i++)
			{
				if(digit%i==0)
				{
					isprime =false;
					break;
				}
			}
			num= num/10;
			if(isprime==true)
			{
				System.out.println(digit);
			}
			
		}
	}

}
