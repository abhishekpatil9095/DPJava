package com.arrayOfObject;

import java.util.Scanner;

class Menu{
	int mid;
	String mname;
	int Prize;
	public Menu(int mid, String mname, int prize) {
		super();
		this.mid = mid;
		this.mname = mname;
		Prize = prize;
	}
	@Override
	public String toString() {
		return "Menu [oid=" + mid + ", oname=" + mname + ", Prize=" + Prize + "]";
	}
	
}
public class Order {

	int oid;
	int quantity;
	Menu []m;
	public Order(int oid, int quantity, Menu[] m) {
		super();
		this.oid = oid;
		this.quantity = quantity;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Order [id=" + oid + ", quantity=" + quantity + ", m=" + m + "]";
	}
	
	public static void main(String[] args) {
		Order o[]= new Order[2];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<o.length;i++)
		{
			System.out.println("Enter order details");
			System.out.println("Enter order id");
			int oid= sc.nextInt();
			
			System.out.println("Enter quantity");
			int quantity= sc.nextInt();
			
			System.out.println("enter menu quantity");
			int n= sc.nextInt();
			Menu me[]= new Menu[n];
			System.out.println("Enter menu details");
			for(int j=0;j<me.length;j++)
			{
			System.out.println("Enter menu id");
			int mid= sc.nextInt();
			
			System.out.println("enter menu name");
			String mname= sc.next();
			
			System.out.println("enter prize");
			int prize= sc.nextInt();
			
			me[j]= new Menu(mid, mname,prize);
			}
			o[i]=new Order(oid,quantity,me);
		}
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
	}
}
