package com.inheritance;
class Clothes{
	String material="cotton";
}

class Shirt extends Clothes{
	public void materials()
	{
		material= "velvet";
		System.out.println(material);
	}
	public void prize()
	{
		System.out.println("450 RS");
	}
}

public class SingleExample3 {
	public static void main(String[] args) {
		
		Shirt s= new Shirt();
		s.materials();
		s.prize();
	}

}
