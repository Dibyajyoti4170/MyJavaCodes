package com.constructor;


public class P3 {
	int i;
	P3()
	{
		i=10;
	}
	P3(int a)
	{
		i=a;
	}

	public static void main(String[] args)
	{
		P3 ob1 = new P3();
		System.out.println(ob1.i);
		P3 ob2 = new P3();
		System.out.println(ob2.i);
		P3 ob3 = new P3();
		System.out.println(ob3.i);
		P3 ob4 = new P3(120);
		System.out.println(ob4.i);
	}
}