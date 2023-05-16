package com.encapsulation;

public class car {
	
	private int modelNo;
	private String carName;
	private int speed;
	
	public void setModelNo(int modelNo)
	{
		this.modelNo=modelNo;
	}
	
	public void setCarName(String carName)
	{
		this.carName=carName;
	}
	
	public void setSpeed(int speed)
	{
		if(speed>80)
			{
				System.out.println("you are over speed");
			}
		this.speed=speed;
	}
	
	public int getModelNo()  
	{
		return modelNo;
	}
	public String getCarName()
	{
		return carName;
	}
	public int getspeed()
	{
		return speed;
	}
}
