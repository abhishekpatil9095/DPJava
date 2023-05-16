package com.thisKeyword;

public class task {
	
	int x;
	public task()
	{
		this.show(300);
		System.out.println("constructor method value= "+x);
	}
	
	public void show(int x)
	{
		this.x=x;
		System.out.println("value of instance variable= "+x);
		System.out.println("method value= "+x);
	}
	
	public static void main(String[] args) {
		
		task t= new task();
		
		
	}

}
