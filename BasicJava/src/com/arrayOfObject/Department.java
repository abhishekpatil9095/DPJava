package com.arrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Emp{
	int ide;
	String names;
	int esalary;
	public Emp(int ide, String names, int esalary) {
		super();
		this.ide = ide;
		this.names = names;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + ide + ", ename=" + names + ", esalary=" + esalary + "]";
	}
	
}
public class Department {

	int did;
	String dname;
	Emp [] e;
	public Department(int did, String dname, Emp[] e) {
		super();
		this.did = did;
		this.dname = dname;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", e=" + Arrays.toString(e) + "]";
	}
	
	public static void main(String[] args) {
		
		Department dt[]=new Department[3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<dt.length;i++)
		{
			System.out.println("enter department details");
			System.out.println("enter department id");
			int eid= sc.nextInt();
			
			System.out.println("enter department name");
			String dname= sc.next();
			
			System.out.println("ente no of employees are work on that department");
			int n= sc.nextInt();
			Emp e[]=new Emp[n];
			System.out.println("enter employee details");
			for(int j=0;j<e.length;j++)
			{
			System.out.println("Enter employee id");
			int ide= sc.nextInt();
			
			System.out.println("enter employee name");
			String names= sc.next();
			
			System.out.println("enter salary");
			int salary= sc.nextInt();
			
			e[j]=new Emp(ide, names, salary);
			}
			dt[i]= new Department(eid, dname,e);
		}
		
		for(int i=0;i<dt.length;i++)
		{
			System.out.println(dt[i]);
		}
	}
}
