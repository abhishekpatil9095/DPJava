package com.containtment;

class Employee{
	private int eid;
	private String ename;
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
}
public class DepartmentGetterSetter1 {
	
	private int did;
	private String dname;
	private Employee emp;

	public void setDid(int did)
	{
		this.did=did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public void setEmp(Employee emp)
	{
		this.emp=emp;
	}
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
	public Employee getEmp()
	{
		return emp;
	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.setEid(1);
		e.setEname("Rushi");
		DepartmentGetterSetter1 d= new DepartmentGetterSetter1();
		d.setDid(101);
		d.setDname("Finance");
		d.setEmp(e);
		
		System.out.println("department id= "+d.getDid());
		System.out.println("department name= "+d.dname);
		System.out.println("employee id= "+e.getEid());
		System.out.println("employee name= "+e.getEname());
	}
}
