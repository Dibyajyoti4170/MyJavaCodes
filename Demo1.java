package com.primitivetypecasting;

public class Demo1 {

	public static void main(String[] args) {
		int [] a = {10,3,4,40};
		System.out.println("the actual output");
		for(int index = 0;index<a.length;index++)
		{
			System.out.println(a[index]);//10//3//4//40
		}
		for(int i = 0;i<a.length;i++)
		{
			a[i] = a[i]+10;//here we are adding 10 to the previous value.
		}
		System.out.println("after adding the value the results are as follows");
		for(int index = 0;index<a.length;index++)
		{
			System.out.println(a[index]);//20//13//14//50
		}
		}
		}

