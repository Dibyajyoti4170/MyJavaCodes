package com.nonstaticmembers;

public class Demo6 {
	void m1()
	{
      System.out.println("from m1()");
      System.out.println(this);//store the address of the called block
	}
	public static void main(String[] args) {
		System.out.println("from main of Demo6");
		Demo6 x = new Demo6();
		System.out.println(x);
		x.m1();
		System.out.println("end main");
	}

}
