package com.exceptionHandling;

class InvalidBinary extends RuntimeException{
	public InvalidBinary()
	{
		super();
	}
	public InvalidBinary(String msg)
	{
		super(msg);
	}
}
public class CustException {

	public void CheckBinary(int num)
	{
		int copy=num;
		int count=0;
		int sum=0;
		boolean isbinary=true;
		while(num>0)
		{
			int digit=num%10;
			count++;
			num=num/10;
			if((digit==0)||(digit==1))
			{
				continue;
			}
			else
			{
				isbinary=false;
				break;
			}
		}
		if(isbinary==false)
		{
			throw new InvalidBinary("Number not binary");
		}
		else
		{
			num=copy;
			int base=1;
			while(num>0)
			{
				int digit=num%10;
				num=num/10;
				sum += digit*base;
				base= base*2;
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		try
		{
		CustException c= new CustException();
		c.CheckBinary(100);
		}
		catch(InvalidBinary i)
		{
			System.out.println(i);
		}
		System.out.println("done");
	}
}
