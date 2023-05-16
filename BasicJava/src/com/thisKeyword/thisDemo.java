package com.thisKeyword;

public class thisDemo {
	
	int x;
	public thisDemo(int x)	//declare and initialize constructor
	{
		this.x=x;		//declare instance variable by this keyword
	}
	
	public void show() {	//declare ND INITIALIZE METHOD
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		thisDemo t= new thisDemo(250);	// create object
		t.show();						// call method
	}

}
