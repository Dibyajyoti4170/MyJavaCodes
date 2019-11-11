package com.misceleneous;

 class MainClass {
	static void display(A ob)
	{
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println("****************");
	}

	public static void main(String[] args) {
		A ob1  = new A(10,100.2);
		A ob2  = new A(100,100.24);
		A ob3  = new A(1000,100.245);
		A ob4  = new A(10000,100.2456);
		display(ob1);
		display(ob2);
		display(ob3);
		display(ob4);

	}

}
