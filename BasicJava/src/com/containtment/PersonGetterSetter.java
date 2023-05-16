package com.containtment;

class address1{
	private int pin_code;
	private String state;
	
	public void setPin_code(int pin_code)
	{
		this.pin_code=pin_code;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public int getPin_code()
	{
		return pin_code;
	}
	public String getState()
	{
		return state;
	}
}
public class PersonGetterSetter {
	int perId;
	String names;
	address1 ad;
	
	public void setPerId(int perId)
	{
		this.perId=perId;
	}
	public void setNames(String names)
	{
		this.names=names;
	}
	public void setAddress(address1 ad)
	{
		this.ad=ad;
	}
	
	public int getPerId()
	{
		return perId;
	}
	public String getNames()
	{
		return names;
	}
	public address1 getAddress()
	{
		return ad;
	}
	
	public static void main(String[] args) {
		PersonGetterSetter o= new PersonGetterSetter();
		o.setPerId(301);
		o.setNames("vijay");
		address1 b= new address1();
		b.setPin_code(50204);
		b.setState("maharashtra");
		
		System.out.println(o.getPerId());
		System.out.println(o.getNames());
		System.out.println(b.getPin_code());
		System.out.println(b.getState());
	}

}
