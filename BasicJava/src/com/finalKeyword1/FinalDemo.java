package com.finalKeyword1;

public class FinalDemo {
	
	final int y;	// blank final variable. when we don't initialize
	final int x= 25;
	public FinalDemo()
	{
		y=11;		// we can initialize in constructor or block.
				//because constructor or block of code run first so it assign value to final
		//x=67;		//error because when we declare final keyword then we can't change value
	}
	
	
	public void show()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		FinalDemo f= new FinalDemo();
		f.show();
	}
}
