package com.classAssignMethod;

public class Assign1 {
	//Que-
//	 add method displayData inside Student class change
//	values of id name in that method & also print the changed
//	values in same method. Call displayData method from
//	main method and see the output. Observe displayData can
//	only be called by creating object of Student

	int id=1001;
	String name="Abhishek";
	public void display()
	{
		id=2000;
		name= "abhi";
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	
		Assign1 a= new Assign1();
		System.out.println(a.id);
		System.out.println(a.name);
		a.display();
	
	}

}
