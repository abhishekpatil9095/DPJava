package com.accessModifiers;

public class BankInfo {
	
	public static void main(String[] args) {
		
		Bank c= new Bank();
		System.out.println(c.getb_name("Sbi"));
		System.out.println(c.getbranch_name("Satara"));
		System.out.println(c.getrateofinterest(4.5f));
		//System.out.println(b.getlocker_id(1001));		// because private only within class
	}

}
