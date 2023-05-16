package com.classAssignContainment;
class Pen{
	String colour;
	String name;
	int Pen_price;
	Nib nb;
	
	public Pen(String colour, String name, int Pen_price,Nib nb)
	{
		this.colour=colour;
		this.name=name;
		this.Pen_price=Pen_price;
		this.nb=nb;
	}
	
	public String toString()
	{
		return colour+" "+name+" "+Pen_price+" "+nb;
	}
	
}
class Nib{
	String material;
	int Nib_price;
	
	public Nib(String material,int Nib_price)
	{
		this.material=material;
		this.Nib_price=Nib_price;
	}
	
	public String toString()
	{
		return material+" "+Nib_price;
	}
}

public class Bag {
	
	String brand_name;
	int price;
	Pen p;
	
	public Bag(String brand_name, int price,Pen p)
	{
		this.brand_name=brand_name;
		this.price=price;
		this.p=p;
	}

	public String toString()
	{
		return brand_name+" "+price+" "+p;
	}
	
	public static void main(String[] args) {
		Bag b= new Bag("Skybag",800,new Pen("Black","Cello",10,new Nib("Plastic",250)));
		System.out.println(b);
	}
}
