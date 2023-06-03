package com.abstractMethod;

abstract class Admission{		//abstract class
	abstract void fillForm();
}

abstract class OnlineRegistration extends Admission{	//abstract inherit abstract class
	public void fillFormUrl()		//when we inherit abstrct class in abstract class so don't need to complete the abstract method we can complete in child class. 
	{
		System.out.println("Go to main page");
	}
}
class Registration extends OnlineRegistration{
	public void fillForm()	//abstract method completed
	{
		System.out.println("Form submitted");
	}
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		Registration r= new Registration();
		r.fillFormUrl();
		r.fillForm();
	}

}
