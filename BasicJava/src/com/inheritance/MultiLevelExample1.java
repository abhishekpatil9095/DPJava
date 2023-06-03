package com.inheritance;

class Furniture{
	String chair;
	String table;
}
class Room extends Furniture{
	public void chairs()
	{
		chair="Wood chair";
		System.out.println(chair);
	}
}
class Staircase extends Room{
	public void tables()
	{
		table="Metal table";
		System.out.println(table);
	}
}
public class MultiLevelExample1 {

	public static void main(String[] args) {
		Staircase s= new Staircase();
		s.chairs();
		s.tables();
	}
}
