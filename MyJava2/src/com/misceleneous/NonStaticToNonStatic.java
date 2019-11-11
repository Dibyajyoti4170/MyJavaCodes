package com.misceleneous;

public class NonStaticToNonStatic {

 int i = 10;
	
	void check()
	{
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args)
	{
		
    	   NonStaticToNonStatic ob = new NonStaticToNonStatic();
    	   ob.check();
       }
	}
