package com.thisKeyword;

public class thisByConstructor {
	
	public thisByConstructor()			//declare default constructor
	{
		this(17,"satara");				//call constructor by this keyword with parameter
		System.out.println("default constructor");
	}
	
	public thisByConstructor(int x, String place)
	{
		//this();							//call constructor by this keyword without parameter
		System.out.println(x+" "+place);
	}
	
	public static void main(String[] args) {
		
		thisByConstructor t= new thisByConstructor();
		
	//	thisByConstructor t2= new thisByConstructor(101,"Satara");
	}

}
