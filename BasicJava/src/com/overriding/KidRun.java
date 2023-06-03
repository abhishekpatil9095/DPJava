package com.overriding;

class Kid{
	public void readBook()
	{
		System.out.println("read book");
	}
}

class BigKid extends Kid{
	@Override
	public void readBook()			//Override method
	{
		System.out.println("read historical books");
	}
	public void readBook(String name)
	{
		System.out.println("read books"+ name);
	}
}

public class KidRun {

	public static void main(String[] args) {
		BigKid b= new BigKid();
		b.readBook();				//Call override method
	}
	
}
