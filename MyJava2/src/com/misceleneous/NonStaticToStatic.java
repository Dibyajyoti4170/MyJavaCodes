package com.misceleneous;

public class NonStaticToStatic {
	
	

 int i = 10;
static void display()
{
	NonStaticToStatic ob = new NonStaticToStatic();
	System.out.println(ob.i);
}

	public static void main(String[] args)
	{
		
		NonStaticToStatic ob = new NonStaticToStatic();
    	   ob.display();
       }
	}
