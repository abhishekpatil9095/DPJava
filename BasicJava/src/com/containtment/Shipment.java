package com.containtment;

// containtment By using Constructor
class order{
	int order_id;
	int cust_id;
	String city;
	public order(int order_id,int cust_id, String city)
	{
		this.order_id=order_id;
		this.cust_id=cust_id;
		this.city=city;
	}
}

class myDate{
	int mm;
	int dd;
	int yy;
	public myDate(int mm,int dd, int yy)
	{
		this.mm=mm;
		this.dd=dd;
		this.yy=yy;
	}
}

public class Shipment {
	
	int id;
	order o;
	myDate m;
	
	public Shipment(int id,order o, myDate m)
	{
		this.id=id;
		this.o=o;
		this.m=m;
	}
	
	public static void main(String[] args) {
		
		Shipment s= new Shipment(101,new order(1,2001,"Satara"),new myDate(05,15,2023));
		System.out.println(s.id);
		System.out.println(s.o.order_id);
		System.out.println(s.o.cust_id);
		System.out.println(s.o.city);
		System.out.println(s.m.mm+","+s.m.dd+","+s.m.yy);
	}
}
