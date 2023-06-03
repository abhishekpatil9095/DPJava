package com.finalKeyword1;

 class Parent{				// we can't declare parent class as final
	public final void show()
	{
		System.out.println("parent");
	}
}
final class Child extends Parent{	//but we declare child class as final
	public void display()		//can't override final method
	{
		super.show();
	}
}

	
public class FinalMethodDemo {

	Child c= new Child();
	
	
}
