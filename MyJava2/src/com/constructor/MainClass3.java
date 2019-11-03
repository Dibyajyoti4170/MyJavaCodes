package com.constructor;

public class MainClass3 {

	public static void main(String[] args) {
		P4 ob1 = new P4(10,false);
		P4 ob2 = new P4(200,true);
		System.out.println("i: "+ob1.i+"b: "+ob1.b);
		System.out.println("i: "+ob2.i+"b: "+ob2.b);
		

	}

}

//OUTPUT
//false
//0
//false
//i: 10b: false
//i: 200b: true