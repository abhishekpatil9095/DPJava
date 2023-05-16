package com.accessModifiers;

public class AccessModifier {
	
	private int x=10;
	
	int y= 20;
	
	protected int z=30;
	
	public int j= 40;
	
	public static void main(String[] args) {
		
		AccessModifier a=new AccessModifier();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.j);
		
		a.demo();
		a.demo1();
		a.demo2();
		a.demo3();
	}
	
	private void demo()
	{
		System.out.println("private");
	}
	
	void demo1()
	{
		System.out.println("default");
	}
	
	protected void demo2()
	{
		System.out.println("protected");
	}
	
	public void demo3()
	{
		System.out.println("public");
	}

}
