package com.nonstaticmembers;

public class C {
	int i;
	void initializing(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) {
		C x = new C();
		x.initializing(10);
		System.out.println(x.i);

	}

}
 