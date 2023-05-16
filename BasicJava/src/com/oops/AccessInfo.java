package com.oops;
import com.accessModifiers.*;
public class AccessInfo extends AccessModifier{
	public static void main(String[] args) {
		
	AccessModifier c= new AccessModifier();
//	System.out.println(c.y);	error
//	System.out.println(c.z);	error
	System.out.println(c.j);
	
	
//	c.demo();	// error because of default method in diff package
	c.demo3();
	
	AccessInfo d= new AccessInfo();		// create object of child class
	System.out.println(d.z);
	System.out.println(d.j);
	
	d.demo2();			//call method
	d.demo3();
	

	}
}
