package com.accessModifiers;

public class AccessDemo {
	
	public static void main(String[] args) {
		
		AccessModifier b= new AccessModifier();
		//System.out.println(b.x);		error
		System.out.println(b.y);
		System.out.println(b.z);
		System.out.println(b.j);
		
	//	b.demo();	//error because of private modifier
		b.demo1();
		b.demo2();
		b.demo3();
		
	}

}
