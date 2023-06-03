package com.overriding;

// covarient is one of overriding with non primitive type of return type.

class Vehical {
	public Animal show()
	{
		return new Animal();	//if parent return any object then child can return either 
	}							//same of object other than child of parent.
}
class Car extends Vehical{
	public Dog show() {
		System.out.println("car");
		return new Dog();
	}
}
public class Covarient {

	public static void main(String[] args) {
		Car c= new Car();
		c.show();
		
	}
}
