package com.misceleneous;

public class StaticToStatic {
	
	static int i;
	
	static void check()
	{
		i=10;
		System.out.println(i);
		System.out.println(StaticToStatic.i);
	}

	public static void main(String[] args)
	{
		
    	   StaticToStatic.check(); 
       }
	}


