package com.constructor;

public class Demo3 {
	Demo3()
	{
		System.out.println("from Demo3()");
	}
	Demo3(int i)
	{
		System.out.println("from Demo3(int)");
	}
	Demo3(int i, int j)
	{
		System.out.println("from Demo3(int,int)");
	}

	public static void main(String[] args) {
		Demo3 ob1 = new Demo3();
		Demo3 ob2 = new Demo3(15,30);
		Demo3 ob3 = new Demo3(60);
	}

}
