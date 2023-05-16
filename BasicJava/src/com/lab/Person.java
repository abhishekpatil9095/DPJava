package com.lab;

public class Person {
	
	private String acc_no;
	private String per_name;
	private double balance;
	
	public void setAcc_no(String acc_no)
	{
		this.acc_no=acc_no;
	}
	
	public void setPer_name(String per_name)
	{
		this.per_name=per_name;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getAcc_no()
	{
		return acc_no;
	}
	
	public String getPer_name()
	{
		return per_name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}
