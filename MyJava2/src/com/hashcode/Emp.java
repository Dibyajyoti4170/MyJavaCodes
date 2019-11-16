package com.hashcode;

public class Emp {
	
	int id;
	String name;
	double salary;
	Emp()
	{
		
	}
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id +" "+name+ " " +salary;
		
	}
	public boolean equals(Object ob)
	{
		Emp temp=(Emp) ob;
		return this.id==temp.id;
		
	}
	
	public int hashCode()
	{
		int hc;
		hc=id + (int)salary+ name.hashCode();
		return hc;
	}
}


