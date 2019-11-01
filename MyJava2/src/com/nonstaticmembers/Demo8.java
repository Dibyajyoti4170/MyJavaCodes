package com.nonstaticmembers;

public class Demo8 {
	int i;
	void test()
	{
		System.out.println(i);
		i=20; 
		System.out.println(this.i);
	}

	public static void main(String[] args) 
	{
		Demo8 obj1 = new Demo8();
		System.out.println(obj1.i);
		obj1.test();
	}

}
