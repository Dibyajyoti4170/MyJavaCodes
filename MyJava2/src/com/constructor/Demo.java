package com.constructor;

public class Demo {
	
	Demo()
	{
	  System.out.println("hello");	
	}
	
	Demo(int i)
	{
		this();
		System.out.println("from Demo()");
	}
	
	Demo(int i, int j)
	{
		this();
		System.out.println("welcome to dream world");
	}

	public static void main(String[] args) 
	{
	  Demo obj1 = new Demo();
	  System.out.println("******************");
	  Demo obj2 = new Demo(30);
	  System.out.println("++++++++++++++++++");
	  Demo obj3 = new Demo(30,70);
	}

}
