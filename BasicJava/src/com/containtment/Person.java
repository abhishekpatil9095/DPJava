package com.containtment;

// Containment by using Constructor with toString method
class Address{
	int pincode;
	String city;
	public Address(int pincode, String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	
	public String toString()		// use toString method for printing output
	{
		return pincode+" "+city;
	}
}
public class Person {
	
	int id;
	String name;
	Address adr;
	
	public Person(int id, String name, Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	
	public String toString()		//use toString method for printing output
	{
		return id+" "+name+" "+adr;
	}
	
	public static void main(String[] args) {
		Address a= new Address(400504,"pune");
		Person e=new Person(201,"Vishal",a);
		
	//	Person p= new Person(101,"Abhi",new Address(415004,"Satara"));	//another type of object creation
		System.out.println(e);
	}

}
