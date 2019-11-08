package com.downcasting;

class MainClass {
	public static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
			System.out.println(((B)obj).j);
		if(obj instanceof C)
		System.out.println(((C)obj).k);
		System.out.println("===================================");
	}
	public static void main(String[] args) {
		A ob1=new A(10);
		B ob2=new B(1000,15000);
		C ob3=new C(1000,2000,3000);
		A ob4=new C(2000,4000,6000);
		A ob5=new C(5000,1000,1500);
		display(ob1);
		display(ob2);
		display(ob3);
		display(ob4);
		display(ob5);
	}
}
