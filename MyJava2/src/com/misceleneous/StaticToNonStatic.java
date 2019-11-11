package com.misceleneous;

public class StaticToNonStatic {

static int i = 10;
	
	void check()
	{
		System.out.println(i);
		System.out.println(StaticToNonStatic.i);
	}

	public static void main(String[] args)
	{
		
    	   StaticToNonStatic ob = new StaticToNonStatic();
    	   ob.check();
       }
	}
