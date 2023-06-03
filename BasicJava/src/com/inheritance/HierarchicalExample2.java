package com.inheritance;

class Watch{
	int time;
}
class WristWatch extends Watch{
	public void show()
	{
		time= 9;
		System.out.println(time);
	}
}
class WallWatch extends Watch{
	public void show_time()
	{
		time= 12;
		System.out.println(time);
	}
}
public class HierarchicalExample2 {

	public static void main(String[] args) {
		WristWatch w= new WristWatch();
		w.show();
		WallWatch ww= new WallWatch();
		ww.show_time();
	}
}
