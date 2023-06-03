package com.overriding;

class Animal {
	 public  void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class Dog extends Animal{
	@Override				// Annotation to see for method is overriding or not
	public void eat()
	{
		System.out.println("dog is eating dog food");
		super.eat();
	}
	
	public void eat(String food)	//Yes we can overload a overriden method
	{
		System.out.println("dog also eat "+food);
	}
	public void eat (String food,String drink)
	{
		System.out.println("dog also eat "+food+"also drink "+drink);
	}
}

class Cat extends Dog{
	public void eat(String food)	//Yes we can override a overloaded method
	{
		System.out.println("cat is a animal");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.eat("Fruit");
		
		Cat c= new Cat();
		c.eat();
		c.eat("milk");
	}

}
