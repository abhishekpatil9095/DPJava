package com.test3;

class AB{
	int rollno;
	String name;
	public static void showVar()
	{
//		System.out.println("roll no= "+rollno+"name= "+name);//we can't call non static variable in static method
	}
}
public class Que3 {

	public static void main(String[] args) {
		AB ab= new AB();
		ab.showVar();
	}
}
