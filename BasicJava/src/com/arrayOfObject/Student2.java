package com.arrayOfObject;

import java.util.Scanner;

public class Student2 {

	int id;
	String name;
	int mk;
	public Student2(int id, String name, int mk) {
		this.id = id;
		this.name = name;
		this.mk = mk;
	}
	@Override
	public String toString() {
		return id + ", name=" + name + ", mk=" + mk;
	}
	public static void main(String[] args) {
		
		Student2 st[]= new Student2[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter student details");
			System.out.println("enter student id");
			int id= sc.nextInt();
			
			System.out.println("enter student name");
			String name= sc.next();
			
			System.out.println("enter student marks");
			int mk= sc.nextInt();
			
			st[i]=new Student2(id,name,mk);
			
		}
		for(int i=0;i<st.length;i++)	// for printing given data
		{
			System.out.println(st[i]);
		}
		System.out.println("=====================================");
		for(int i=0;i<st.length;i++)	//print data which marks more 70
		{
			if(st[i].mk>70)
			{
				System.out.println(st[i]);
			}
		}
	}
	
}
