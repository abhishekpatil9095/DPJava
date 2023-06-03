package com.abstractMethod;

abstract class Addition{
	int x=15;
	abstract void add(); 
}

abstract class Additions extends Addition{
	int y=20;
	abstract void show();
	
}

class Results extends Additions{
	int z;
	 public void add()
		{
			 z=x+y;
		}
	public void show()
	{
		System.out.println(z);;
	}
	
}
public class AbstractMulti {

	public static void main(String[] args) {
		Results r= new Results();
		r.add();
		r.show();
	}
}
