package com.polymorphism;

public class Main {
	
	
	public static void main(String[] args) 
	
	{
		
		
		A ob;
		ob=new A();
		ob.test();//from A
		ob=new B();//upcasting
		ob.test();//polymorphism  // from B
		
		// TODO Auto-generated method stub
		ob=new C();//upcasting
		ob.test();//polymorphism
		ob=new B();//uc
		ob.test();//poly
	}
}