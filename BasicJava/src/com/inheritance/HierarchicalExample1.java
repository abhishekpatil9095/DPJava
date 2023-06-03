package com.inheritance;

class Player{
	String kit;
}
class Cricketer extends Player{
	public void show_kit()
	{
		String kit= "White T-shirt & Trousers";
		System.out.println(kit);
	}
	
}
class FootballPlayer extends Player{
	public void Show()
	{
		String kit= "T-shirt & Short";
		System.out.println(kit);
	}

}
public class HierarchicalExample1 {
	public static void main(String[] args) {
		Cricketer c= new Cricketer();
		c.show_kit();
		FootballPlayer f= new FootballPlayer();
		f.Show();
	}

}
