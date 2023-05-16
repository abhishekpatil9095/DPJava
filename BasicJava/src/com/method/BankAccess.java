package com.method;
import com.accessModifiers.*;
public class BankAccess extends Bank{
	
	public static void main(String[] args) {
		
		BankAccess d= new BankAccess();
		System.out.println(d.getb_name("SBI"));
		System.out.println(d.getrateofinterest(4.5f));
	//	System.out.println(b.getbranch_name("SATARA"));	because default access within package
	//	System.out.println(b.getlocker_id(1001));		because private access within class
		
	}
	

}
