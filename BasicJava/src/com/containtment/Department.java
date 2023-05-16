package com.containtment;
class Employee1{
	int empId;
	String empName;
	
	public Employee1(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public String toString()
	{
		return empId+" "+empName;
	}
}
public class Department {
	int deptId;
	String deptName;
	Employee1 emp1;
	
	public Department(int deptId,String deptName,Employee1 emp1)
	{
		this.deptId=deptId;
		this.deptName=deptName;
		this.emp1=emp1;
	}
	
	public String toString()
	{
		return deptId+" "+deptName+" "+emp1;
	}
	
	public static void main(String[] args) {
		Department d= new Department(1001,"HR",new Employee1(11,"Shubham"));
		System.out.println(d);
	}

}
