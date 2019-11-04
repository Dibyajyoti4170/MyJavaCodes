package com.assignments;

public class EmployeeDetail {
	public static void main(String[] args) 
	{
		 EmployeeDetails obj1 = new EmployeeDetails("dibya",20000,666);
		    System.out.println("Employee Name is : " +obj1.name);
		    System.out.println("salary is : " + obj1.salary);
		    System.out.println("id is : " + obj1.id); 
		    EmployeeDetails obj2 = new EmployeeDetails("neha",25000,777);
		    System.out.println("Employee Name is : " +obj2.name);
		    System.out.println("salary is : " + obj2.salary);
		    System.out.println("id is : " + obj2.id);      
	    
}


}
