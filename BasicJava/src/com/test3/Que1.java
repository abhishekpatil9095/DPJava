package com.test3;

class Parent{
	int num=100;
	public void show()
	{
		System.out.println("i am parent");
	}
}
class Child extends Parent{
	int num=200;
	public void show()
	{
		System.out.println("i am child");
	}
}
public class Que1{

	public static void main(String[] args) {
		Parent ch1= new Child();
		System.out.println(ch1.num);
		ch1.show();
	}
}
