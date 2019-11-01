package com.nonstaticmembers;

public class Demo5 {
	int i=10;
	public static void main(String[] args) 
	{
		Demo5 ob = new Demo5();
		int i =20;
		System.out.println(i);
		System.out.println(ob.i);
	}

}
