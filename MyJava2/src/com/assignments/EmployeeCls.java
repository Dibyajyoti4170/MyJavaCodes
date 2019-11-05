package com.assignment_03;

public class EmployeeCls
{

	public static void main(String[] args) 
	{
	    Employee Emp1 = new Employee("Jyothi",20.0,1);
	    System.out.println("Employee Name is : " +Emp1.name);
	    System.out.println("salary is : " + Emp1.salary);
	    System.out.println("id is : " + Emp1.id); 
	    Employee Emp2 = new Employee("Nandini",25.0,2);
	    System.out.println("Employee Name is : " +Emp2.name);
	    System.out.println("salary is : " + Emp2.salary);
	    System.out.println("id is : " + Emp2.id);      
	}
}
