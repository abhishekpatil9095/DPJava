package com.inheritance;
class Worker{
	String work="8 hour working";
}
class Postman extends Worker{
	public void work() {
		work="12 hour work";
		System.out.println(work);
	}
	public void relax()
	{
		System.out.println("relax for 1 hour");
	}
}

public class SingleExample2 {

	public static void main(String[] args) {
		Postman p= new Postman();
		p.work();
		p.relax();
		
	}
}
