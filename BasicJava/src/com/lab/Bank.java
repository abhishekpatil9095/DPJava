package com.lab;

public class Bank {
	
	public static void main(String[] args) {
		
		PayTM p1= new PayTM();
	
		Person p=p1.details();
		System.out.println(p.getAcc_no());
		System.out.println(p.getPer_name());
		System.out.println(p.getBalance());
		
		double amount= p.getBalance()-2000;
		
		System.out.println(amount);
//
//		Person o= new Person();
//		System.out.println(o.getAcc_no());
//		System.out.println(o.getPer_name());
//		System.out.println(o.getBalance());
	}

}
