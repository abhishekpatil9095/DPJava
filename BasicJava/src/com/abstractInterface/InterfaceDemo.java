package com.abstractInterface;

interface Printable{
	int x=45;// when we declare variable in interface then we need to declare and initialize 
	void print();
	void draw();
	default void checkIn()	// When we want to write body to method then method should be static or default
	{						//concrete method
		System.out.println("Default");
	}
	static void countPage()		//concrete method
	{
		System.out.println("no of count");
	}
}

class NoteBook implements Printable, Drawable{
	public void print()
	{
		System.out.println("Print method from child class"+x);
	}
//	default void checkIn()	// we can't override default method of interface.
//	{//because of visibility of default in interface we can use  higher precedense of access modifier to method
//		System.out.println("override default method from interface");
//	}
	
	public void draw()
	{
		System.out.println("Draw method from interface");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		NoteBook n= new NoteBook();
		n.print();
		n.draw();
		
		Printable p= new NoteBook();	// Dynamic dispatch method or upcasting
		p.print();
		p.checkIn();
	//	p.draw();	//error
		Printable.countPage(); 	// we need to call static method with class name
		
	}
}
