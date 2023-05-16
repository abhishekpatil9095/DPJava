package com.assignment12May;

public class Que5 {
//	Ticket Price Calculation - Static
//	Ticket Calculation
//	Create a class Ticket with the following private variables
//	int ticketid;
//	int price;
//	static int availableTickets;
//	Include getters and setters methods in the Ticket class.
//	AvailableTickets should hold only positive value. Zero and negative values are not allowed.
//	(This logic should be checked inside the corresponding setter method)
//	Write the following method in the Ticket class:
//	public int calculateTicketCost(int nooftickets) —this method should check the ticket availability, 
//	If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  
//	and return the total amount.  If the tickets are not available, this method should return -1.
//	Write a main method in the Main class to test the application.

	int ticketid;
	int price;
	static int availableTickets;
	int noOfTickets;
	
	public void setTicketid(int ticketid)
	{
		this.ticketid=ticketid;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setAvailableTicket(int availableTickets)
	{
		if(availableTickets>0)
		{
		this.availableTickets=availableTickets;
		}
	}
	
	public int getTicktid()
	{
		return ticketid;
	}
	public int getPrice()
	{
		return price;
	}
	public int getAvailableTicket()
	{
		return availableTickets;
	}
	
	public int calculateCost(int noOfTickets)
	{
		int totalAmount=0;
		if(availableTickets>0)
		{
			totalAmount=noOfTickets*price;
			this.availableTickets= availableTickets-noOfTickets;
		}
		else
		{
			System.out.println("No seats available");
		}
		return totalAmount;
	}
	
	public static void main(String[] args) {
		
		Que5 q= new Que5();
		q.setAvailableTicket(25);
		q.setTicketid(101);
		q.setPrice(100);
		
		System.out.println("Available ticket: "+q.getAvailableTicket());
		System.out.println("TicketId: "+q.getTicktid());
		System.out.println("Price: "+q.getPrice());
		System.out.println("Total cost: "+q.calculateCost(5));
		System.out.println("available ticket: "+q.getAvailableTicket());
		
		Que5 r= new Que5();
		q=r;
		r.setTicketid(124);
		r.setPrice(100);
		
		System.out.println("Available ticket: "+r.getAvailableTicket());
		System.out.println("TicketId: "+r.getTicktid());
		System.out.println("Price: "+r.getPrice());
		System.out.println("Total cost: "+r.calculateCost(2));
		System.out.println("available ticket: "+r.getAvailableTicket());

	}
	
}
