package com.encapsulation;

public class CarAccess {
	
	public static void main(String[] args) {
		
		car c= new car();
		c.setCarName("BMW");
		c.setModelNo(1717011192);
		c.setSpeed(55);
				
		if(c.getspeed()<80) 
		{
			System.out.println("car name "+c.getCarName());
			System.out.println("Car model number "+c.getModelNo());
			System.out.println("car speed "+c.getspeed());
		}
	}

}
