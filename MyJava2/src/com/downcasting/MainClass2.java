package com.downcasting;

class MainClass2 {
	public static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
			System.out.println(((B)obj).j);
		if(obj instanceof C)
			System.out.println(((C)obj).k);
		System.out.println("+++++++++++++++++++++++++");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(4500);
		B ob2=new B(67900,15870);
		C ob3=new C(1568,24567,3456);
		display(ob1);
		display(ob2);
		display(ob3);
	}

}