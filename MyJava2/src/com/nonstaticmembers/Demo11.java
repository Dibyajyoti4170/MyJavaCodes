package com.nonstaticmembers;

public class Demo11 {
	//private static Demo11 obj;
	int i;
	void initializing(int i)
	{
		i=10;
	 System.out.println(i);
	}
	public static void main(String[] args)
	{
	Demo11 obj = new Demo11();
	System.out.println(obj.i);//0
	obj.initializing(obj.i);//10

	}

}
