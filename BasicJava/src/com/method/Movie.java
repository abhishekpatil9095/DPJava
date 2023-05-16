package com.method;

public class Movie {
	
	int screen;
	String name;
	double price;
	int coupan;
	
	public Movie(int scr,String moviename,int prices){
		screen=scr;
		name=moviename;
		price=prices;
	}
	
	public double getPrice(double disc) {
		if(disc==100) {
			price=price-(price*0.15);
		}
		else if (disc==200) {
			price= price-(price*0.1);
		}
		else
		{
			price=price-0;
		}
		return price;
		
	}

}
