package com.oops;

public class TypeCast {
	
	public static void main(String[] args) {
		// convert lower data type to higher

//		int x=10;				
//		double d=x;
//		System.out.println(d);		

		//convert higher data type to lower
		// in this case data lost
		double x=34.56;
		int a=(int)x;
		System.out.println(a);
	}

}
