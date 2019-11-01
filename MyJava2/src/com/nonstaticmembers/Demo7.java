package com.nonstaticmembers;

public class Demo7 {
	void m1()//non-static method is an non-static constructor....
	{
		System.out.println("from m1()");
	}

	public static void main(String[] args) 
	{
		Demo7 x = new Demo7();//we call non-static method using object reference.....
		x.m1();

	}

}
