package com.Final;

public class Demo3 {
	
	final static int x = 20;
	
	public static void main()
	{
		System.out.println(x);
		System.out.println("*********************");
		//x++;// once the final keyword is fixed then the value cannot be updated.
		System.out.println(x);
		System.out.println("*********************");
		System.out.println(x % 2);
		System.out.println(x);
		System.out.println("*********************");
		
	}	

}
