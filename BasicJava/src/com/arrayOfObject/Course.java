package com.arrayOfObject;

import java.util.Scanner;

class Student{
	int sid;
	String sname;
	int marks;
	
	public Student(int sid, String sname, int marks)
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	public String toString()
	{
		return sid+" "+sname+" "+marks;
	}
}
public class Course {

	int cid;
	String cname;
	Student std;
	
	public Course(int cid, String cname, Student std)
	{
		this.cid=cid;
		this.cname=cname;
		this.std=std;
	}
	public String toString()
	{
		return cid+" "+cname+" "+std;
	}
	public static void main(String[] args) {
		Course c[]=new Course[2];
		
		Scanner sc= new Scanner (System.in);
		for(int i=0;i<c.length;i++)
		{
		System.out.println("Enter course details");
		System.out.println("Enter course id");
		int cid=sc.nextInt();
		System.out.println("enter course name");
		String cname= sc.next();
		System.out.println("Enter student details");
		System.out.println("Enter student id");
		int sid= sc.nextInt();
		System.out.println("Enter student name");
		String sname= sc.next();
		System.out.println("Enter student marks");
		int marks= sc.nextInt();
		
		c[i]=new Course(cid, cname, new Student(sid,sname,marks));
		}
		System.out.println("======================================");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		// find course which has student with more than 70 marks
		for(int i=0;i<c.length;i++)
		{
			if(c[i].std.marks>70)
			{
				System.out.println("students which have more than 70 marks: "+c[i]);
			}
		}
	}
}
