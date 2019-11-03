package com.constructor;

public class MainClass1 {

	public static void main(String[] args) 
	{
		System.out.println("from main of mainclass1");
		Demo1 obj1 = new Demo1();
		System.out.println("*****************");
		Demo1 obj2 = new Demo1();
		System.out.println("main of main class ends");
	}

}
// OUTPUT
//from main of mainclass1
//from Demo1()
//*****************
//from Demo1()
//main of main class ends
