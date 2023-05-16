package com.oops;

public class Shopping {
	
	int customerID;
	String productName;
	int prizes;
	int quantity;
	
	public void details(int id,String product, int prize, int quant ) {
		customerID=id;
		productName=product;
		prizes=prize;
		quantity=quant;
	}
	public int bill() {
		int totalBill= prizes*quantity;	
		System.out.println("bill= "+totalBill);
		return totalBill;
	}
	
	public void display() {
		System.out.println("CustomerID= "+customerID+" "+"Product= "+productName+" "+"prize= "+prizes+" "+"quantity= "+quantity);

		if(quantity>0)
		{
			System.out.println("Total quantity= "+quantity);
		}
		else
		{
			System.out.println("No bill");
		}
	}
	
	public static void main(String[] args) {
		Shopping s= new Shopping();
		s.details(12, "Tshirts", 450, 2);
		s.display();
		s.bill();
		
		
	}

}
