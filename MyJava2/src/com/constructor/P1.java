package com.constructor;

public class P1 {
	P1()
	{
		int i;
		System.out.println(this);
	}
	public static void main(String[] args) {
		P1 ob = new P1();
		System.out.println(ob);
		System.out.println("+++++++++++++++");
		P1 ob1 = new P1();
		System.out.println(ob1);

	}

}

//output
//com.constructor.P1@52e922
//com.constructor.P1@52e922
//+++++++++++++++
//com.constructor.P1@25154f
//com.constructor.P1@25154f