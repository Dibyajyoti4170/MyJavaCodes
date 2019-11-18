package com.downcasting;

class MainClass2 {
	public static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
			System.out.println(((B)obj).j);
		if(obj instanceof C2)
			System.out.println(((C2)obj).k);
		System.out.println("+++++++++++++++++++++++++");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(4500);
		B ob2=new B(67900,15870);
		C2 ob3=new C2(1568,6759);
		display(ob1);
		display(ob2);
		display(ob3);
	}

}