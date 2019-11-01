package com.nonstaticmembers;

public class Demo9 {
	int i=10;
	void test()
	{
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args)
	{
		Demo9 ob = new Demo9();
		ob.test();
		
	}

}
