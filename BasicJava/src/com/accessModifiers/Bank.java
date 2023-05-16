package com.accessModifiers;

public class Bank {
	public String b_name;
	private int locker_id;
	protected float rateofinterest;
	String branch_name;
	
//	public  Bank(String b_name, int locker_id, float rateofinterest, String branch_name)
//	{
//		this.b_name=b_name;
//		this.branch_name=branch_name;
//		this.locker_id=locker_id;
//		this.rateofinterest=rateofinterest;
//	}
	
	public String getb_name(String b_name)
	{
		return b_name;
	}
	private int getlocker_id(int locker_id)
	{
		return locker_id;
	}
	protected float getrateofinterest(float rateofinterest)
	{
		return rateofinterest;
	}
	String getbranch_name(String branch_name)
	{
		return branch_name;
	}
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		System.out.println(b.getb_name("SBI"));
		System.out.println(b.getbranch_name("SATARA"));
		System.out.println(b.getlocker_id(1001));
		System.out.println(b.getrateofinterest(4.5f));
	}

}
