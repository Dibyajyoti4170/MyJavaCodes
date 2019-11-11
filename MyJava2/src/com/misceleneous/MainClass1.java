package com.misceleneous;

public class MainClass1 {

	public static void main(String[] args) {
		Employee employee1 = Employee.createEmployee(1,"Ajay",7.7).display();
		Employee employee2 =Employee.createEmployee(2,"Bidesh",7.6).display();
		employee2.initialize(35.0).display();
		//Employee.createEmployee(3,"Chandan",7.5).display().initialize(8.7).display();
		//Employee.createEmployee(4,"Dinga",7.4).display().initialize(8.8).display();

	}

}


