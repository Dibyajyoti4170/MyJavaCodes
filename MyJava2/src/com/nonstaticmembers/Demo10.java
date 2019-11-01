package com.nonstaticmembers;

public class Demo10 {
	int i=10;
void test(int i)
{
	System.out.println(i);
	System.out.println(this.i);
}
	public static void main(String[] args)
	{
		Demo10 ob = new Demo10();
		ob.test(20);
		System.out.println(ob.i);

	}

}
