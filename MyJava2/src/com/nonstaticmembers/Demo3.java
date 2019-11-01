package com.nonstaticmembers;

public class Demo3 {

	public static void main(String[] args) {
		A ob1 = new A();
		A ob2 = new A();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=12.0;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=30.0;
		ob1.d=40.0;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		
}
}
