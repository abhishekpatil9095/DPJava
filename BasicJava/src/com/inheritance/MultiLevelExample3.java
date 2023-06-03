package com.inheritance;

class Device{
	String screens;
	String life;
	public void devices()
	{
		System.out.println("Electronic divice");
	}
}

class Mobile extends Device{
	public void battery() {
		life="long life battery";
		System.out.println(life);
	}
}

class Tablet extends Mobile{
	public void Screen()
	{
		screens= "Full screen";
		System.out.println(screens);
	}
}
public class MultiLevelExample3 {

	public static void main(String[] args) {
		Tablet t= new Tablet();
		t.devices();
		t.battery();
		t.Screen();
	}
}
