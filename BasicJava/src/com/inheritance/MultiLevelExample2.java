package com.inheritance;

class Account {
	int balance;
	String accountType;
}
class SavingAccount extends Account{
	public void accountType()
	{
		System.out.println("Saving");
	}
}
class CheckAccount extends SavingAccount{
	public void accounttype()
	{
		System.out.println("current");
	}
	public void check()
	{
		balance=120000;
		System.out.println(balance);
	}
}
public class MultiLevelExample2 {
public static void main(String[] args) {
	CheckAccount c= new CheckAccount();
	c.accountType();
	c.accounttype();
	c.check();
}
}
