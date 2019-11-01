package com.staticmembers;

class Demo10 {
	static int i;
	static
			{
		System.out.println("from sib");
		System.out.println(i);
		i=20;
			}
			public static void main(String[]args)
			{
				System.out.println("from main");
				System.out.println(i);
			}

}
