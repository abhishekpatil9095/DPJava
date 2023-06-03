package com.abstractInterface;

interface Additions{
	int add(int x, int y);
}

class Result implements Additions{
	public int add(int x,int y)
	{
		int a= x+y;
		System.out.println(a);
		return a;
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		Result r= new Result();
		r.add(10, 15);
	}
}
