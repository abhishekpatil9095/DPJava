package com.thisKeyword;

public class thisDemo2 {
	
	int x;
	 public int details(int x)
	 {
		 get(450);
		 return x*2;
	 }
	 
	 public void show()
	 {
	//	 x=this.details(300);		//call any type both are same
		 this.x=details(400);		//call any type both are same
		 System.out.println(x);
	 }
	 
	 public void get(int x)
	 {
		 System.out.println(x);
	 }
	 
	 public static void main(String[] args) {
		
		 thisDemo2 t= new thisDemo2();
		// t.details(200);
		 t.show();

	}
}
