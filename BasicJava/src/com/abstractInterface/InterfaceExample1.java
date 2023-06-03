package com.abstractInterface;

interface Square{
	int x=30;
	void square();
}

abstract class Quantity implements Square{
	abstract void show();
}

class Details extends Quantity{
	int z;
	public void square() 
	{
		z=x*x;
	}
	public void show()
	{
		System.out.println(z);
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		Details d= new Details();
		d.square();
		d.show();
	}
}
