package com.lab;

public class BookGetterSetter {
	
	private int id;
	private String name;
	private double price;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPrice(double price)
	{
		if(name.equals(name))
		{
			this.price=price-0.05;
		}
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	
	

}
