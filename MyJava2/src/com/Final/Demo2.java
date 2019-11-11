package com.Final;

public class Demo2 {
	public static void main(String[] args) {
	     test(10);
		
	}

	private static void test(final int i) {
		System.out.println(i);
		//i = 20;
		System.out.println(i+20);
		
	}

}
//FORMAL ARGUMENTS
////OUTPUT BEFORE USING FINAL KEYWORD.
//10
//40
//OUTPUT AFTER USING FINAL KEYWORD.
//10
//30
