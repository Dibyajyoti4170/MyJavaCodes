package com.staticmembers;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SM1 {

	public static void main(String[] args) {
		static int i =10;
		System.out.print(i);//10
		i=20;
		System.out.print(i);//20

	}

}
