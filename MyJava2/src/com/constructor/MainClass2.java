package com.constructor;

public class MainClass2 {

		public static void main(String[] args) 
		{
			System.out.println("from main of mainclass2");
			Demo2 obj1 = new Demo2(true);
			System.out.println("*****************");
			Demo2 obj2 = new Demo2(10>20);
			System.out.println("main of main class ends");
		}
	}

