package com.classAssignContainment;

class Pen1{
	private String col;
	private String pen_name;
	private int PenPrice;
	private Nib1 n;
	public void setCol(String col)
	{
		this.col=col;
	}
	public void setPen_Name(String pen_name)
	{
		this.pen_name=pen_name;
	}
	public void setPenPrice(int PenPrice)
	{
		this.PenPrice=PenPrice;
	}
	public void setNib(Nib1 n)
	{
		this.n=n;
	}
	public String getCol()
	{
		return col;
	}
	public String getPen_Name()
	{
		return pen_name;
	}
	public int getPenPrice()
	{
		return PenPrice;
	}
	public Nib1 getNib()
	{
		return n;
	}
}

class Nib1{
	private String materials;
	private int nib_price;
	public void setMaterials(String materials)
	{
		this.materials=materials;
	}
	public void setNib_Price(int nib_price)
	{
		this.nib_price=nib_price;
	}
	public String getMaterials()
	{
		return materials;
	}
	public int getNib_Price()
	{
		return nib_price;
	}
}
public class BagGetterSetter {
	
	private String brands_name;
	private int bag_price;
	private Pen1 pe;
	
	public void setBrands_name(String brands_name)
	{
		this.brands_name=brands_name;
	}
	public void setBag_Price(int bag_price)
	{
		this.bag_price=bag_price;
	}
	public void setPen(Pen1 pe)
	{
		this.pe=pe;
	}
	public String getBrands_name()
	{
		return brands_name;
	}
	public int getBag_Price()
	{
		return bag_price;
	}
	public Pen1 getPen()
	{
		return pe;
	}

	public static void main(String[] args) {
		Nib1 n= new Nib1();
		n.setMaterials("Polyster");
		n.setNib_Price(5);
		Pen1 p= new Pen1();
		p.setCol("white");
		p.setPen_Name("Champ");
		p.setPenPrice(20);
		BagGetterSetter c= new BagGetterSetter();
		c.setBrands_name("Puma");
		c.setBag_Price(900);
		
		System.out.println("material= "+n.getMaterials());
		System.out.println("nib price= "+n.getNib_Price());
		System.out.println("colour= "+p.getCol());
		System.out.println("pen name= "+p.getPen_Name());
		System.out.println("pen price= "+p.getPenPrice());
		System.out.println("brand name= "+c.getBrands_name());
		System.out.println("bag price= "+c.getBag_Price());
	}
}
