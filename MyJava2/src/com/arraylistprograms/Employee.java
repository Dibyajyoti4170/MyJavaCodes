package com.arraylistprograms;

public class Employee {
	
	String name;
	int id;
	
	Employee()
	{
		
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
		@Override
		public String toString() {
			
			return ("[" +name+ "," +id+"]");
	}
	

}
