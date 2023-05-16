package com.containtment;

class order1{
	private int order1_id;
	private int cust1_id;
	private String city1;
	
	public void setOrder1_id(int order1_id)
	{
		this.order1_id=order1_id;
	}
	public void setCust1_id(int cust1_id)
	{
		this.cust1_id=cust1_id;
	}
	public void setCity(String city1)
	{
		this.city1=city1;
	}
	public int getOrder1_id()
	{
		return order1_id;
	}
	public int getCust1_id()
	{
		return cust1_id;
	}
	public String getcity()
	{
		return city1;
	}
}
class myDate1{
	private int mm1;
	private int dd1;
	private int yy1;
	
	public void setMyDate1(int mm1,int dd1, int yy1)
	{
		this.mm1=mm1;
		this.dd1=dd1;
		this.yy1=yy1;
	}
	public String getMyDate1()
	{
		return mm1+" "+dd1+" "+yy1;
	}
}
public class Shipment1 {
	
	private int ide;
	private order1 or;
	private myDate1 my;

	public void setIde(int ide)
	{
		this.ide=ide;
	}
	public void setOr(order1 or)
	{
		this.or=or;
	}
	public void setmyDate1(myDate1 my)
	{
		this.my=my;
	}
	public int getIde()
	{
		return ide;
	}
	public order1 getOr()
	{
		return or;
	}
	public myDate1 getmy()
	{
		return my;
	}
	
	public static void main(String[] args) {
		
		order1 z= new order1();
		z.setOrder1_id(901);
		z.setCust1_id(401);
		z.setCity("kolhapur");
		
		myDate1 n= new myDate1();
		n.setMyDate1(05, 15, 2023);
		
		Shipment1 sh= new Shipment1();
		sh.setIde(1001);
		sh.setOr(z);
		sh.setmyDate1(n);
		
		System.out.println("ide= "+sh.getIde());
		System.out.println("order id= "+z.getOrder1_id());
		System.out.println("cust id= "+z.getCust1_id());
		System.out.println("city= "+z.getcity());
		System.out.println("date= "+n.getMyDate1());
		
	}
	
}
