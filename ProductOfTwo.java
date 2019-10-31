package com.primitivetypecasting;

public class ProductOfTwo {
	public static void product(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void product(int c, int d, int e)
	{
		System.out.println(c*d*e);
	}
	public static void product(double g, double h)
	{
		System.out.println(g*h);
	}
	public static void main(String[] args) {
		product(10,20);
		product(20,30,40);
		product(26.0,10.0);

	}

}
