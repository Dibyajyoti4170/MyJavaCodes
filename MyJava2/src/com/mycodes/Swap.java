package com.mycodes;

public class Swap {
	public static void value(int n1, int n2)
	{
     System.out.println("before swapping");
	 System.out.println(n1);
	 System.out.println(n2);
	 n1=n1+n2;
	 n2=n1-n2;
	 n1=n1-n2;
	 System.out.println("after swapping");
	 System.out.println(n1);
	 System.out.println(n2);
	}
	public static void main(String[] args) 
	{
		value(30,60);
	}

}
