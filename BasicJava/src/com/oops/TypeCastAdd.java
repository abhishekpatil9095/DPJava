package com.oops;

public class TypeCastAdd {
	
	public int calculate(double x,int y)
	{
		return(int)(x+y);
	}
	
	public static void main(String[] args) {
		
		TypeCastAdd t= new TypeCastAdd();
		System.out.println(t.calculate(3.4, 2));
		
		int ans=t.calculate(5.8, 7);
		System.out.println(ans);
	}

}
